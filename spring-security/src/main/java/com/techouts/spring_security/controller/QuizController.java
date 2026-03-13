package com.techouts.spring_security.controller;



import com.techouts.spring_security.model.QuestionWrapper;
import com.techouts.spring_security.model.QuizDto;
import com.techouts.spring_security.model.Response;
import com.techouts.spring_security.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("/create")
    public ResponseEntity<String> quizController(@RequestBody QuizDto quizDto) {
        System.out.println(quizDto.getCategory());
        System.out.println(quizDto.getNumQuestions());
        return quizService.createQuiz(quizDto.getCategory(),quizDto.getNumQuestions());

    }
    @GetMapping("/getQuiz/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizController(@PathVariable("id") int id) {
        System.out.println("It is calling the quiz");
        return quizService.getQuizQuestions(id);
    }
    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable("id") int id,@RequestBody List<Response> responses){
        return quizService.calculateResult(id,responses);
    }


}
