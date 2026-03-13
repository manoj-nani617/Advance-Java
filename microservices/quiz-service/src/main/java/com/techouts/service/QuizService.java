package com.techouts.service;

import com.techouts.feign.QuizInterface;
import com.techouts.model.QuestionWrapper;

import com.techouts.model.Quiz;
import com.techouts.model.Response;
import com.techouts.repository.QuizRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class QuizService {
    @Autowired
    QuizRepo quizRepo;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int numQ) {
      List<Integer> questions = quizInterface.getQuestionForQuiz(category,numQ).getBody();
      System.out.println(questions);
      Quiz quiz = new Quiz();
      quiz.setCategory(category);
      quiz.setQuestionsIds(questions);
      quizRepo.save(quiz);
      return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Quiz quiz = quizRepo.findById(id).get();
        List<Integer> questionsId = quiz.getQuestionsIds();
         return quizInterface.getQuestionFromId(questionsId);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {
            return quizInterface.getScore(responses);

    }
}
