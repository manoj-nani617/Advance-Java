package com.techouts.service;

import com.techouts.model.QuestionWrapper;
import com.techouts.model.Questions;
import com.techouts.model.Quiz;
import com.techouts.model.Response;
import com.techouts.repository.QuizRepo;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizRepo quizRepo;
    public ResponseEntity<String> createQuiz(String category, int numQ) {
      List<Questions> questions = quizRepo. findRandomQuestionsByCategory(category,numQ);
        System.out.println(questions);
      Quiz quiz = new Quiz();
      quiz.setCategory(category);
      quiz.setQuestions(questions);
      quizRepo.save(quiz);
      return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        if(quiz.isPresent()) {
            List<Questions> questionsFromDb = quiz.get().getQuestions();
            List<QuestionWrapper> questionsForUser = new ArrayList<>();
            for (Questions q : questionsFromDb) {
                QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getOptionA(), q.getOptionB(), q.getOptionC(), q.getOptionD());
                questionsForUser.add(qw);
            }
            return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
        }
        else return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Integer> calculateResult(int id, List<Response> responses) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        if(quiz.isPresent()) {
            List<Questions> questions = quiz.get().getQuestions();
            int right = 0;
            int i = 0;
            for (Response response : responses) {
                System.out.println(response.getResponse() );
                if (response.getResponse()== questions.get(i).getCorrectAnswer())
                    right++;
                i++;

            }
            return new ResponseEntity<>(right, HttpStatus.OK);
        }
        else return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
}
