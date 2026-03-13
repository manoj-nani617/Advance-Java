package com.techouts.service;

import com.techouts.model.Questions;
import com.techouts.repository.QuestionRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<List<Questions>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
        }


    }
    public ResponseEntity<List<Questions>> getQuestionByCategory(String category) {
        try {
            List<Questions> categoryQuestion = questionRepository.findByCategory(category);
            return new ResponseEntity<>(categoryQuestion, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
        }

    }

    public ResponseEntity<String> addQuestion(Questions question) {

        try {
            questionRepository.save(question);
            return new ResponseEntity<>("Success", HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>("Failure",HttpStatus.BAD_REQUEST);
        }

    }

    public ResponseEntity<String> updateQuestion(Questions question,int questionNumber) {
        try {
            Questions existingQuestion = questionRepository.findById(questionNumber).orElse(null);
            if(existingQuestion == null){
                return new ResponseEntity<>("Question Not Found",HttpStatus.OK);
            }

            existingQuestion.setQuestion(question.getQuestion());
            existingQuestion.setCategory(question.getCategory());
            existingQuestion.setOptionA(question.getOptionA());
            existingQuestion.setOptionB(question.getOptionB());
            existingQuestion.setOptionC(question.getOptionC());
            existingQuestion.setOptionD(question.getOptionD());
            existingQuestion.setCorrectAnswer(question.getCorrectAnswer());

            questionRepository.save(existingQuestion);
            System.out.println("Updated");
            return new ResponseEntity<>( "updated", HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>("Failed To Update",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> delete(int  questionNumber) {
        try {
            questionRepository.deleteById(questionNumber);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>("Failed To Delete",HttpStatus.BAD_REQUEST);
        }
    }
}
