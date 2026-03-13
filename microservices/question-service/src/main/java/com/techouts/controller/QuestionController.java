package com.techouts.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.techouts.model.QuestionWrapper;
import com.techouts.model.Questions;
import com.techouts.model.Response;
import com.techouts.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allquestions")
    public ResponseEntity<List<Questions>> questions() {
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);

    }
    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Questions question)
    {
        return questionService.addQuestion(question);

    }
    @PutMapping("/update/{questionNumber}")
    public ResponseEntity<String> updateQuestion(@RequestBody Questions question,@PathVariable("questionNumber") int questionNumber)
    {
        return questionService.updateQuestion(question,questionNumber);

    }
    @DeleteMapping("/delete/{questionNumber}")
    public ResponseEntity<String> deleteQuestion(@RequestBody @PathVariable("questionNumber") int  questionNumber) {
        return questionService.delete(questionNumber);
    }

    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> getQuestionForQuiz(@RequestParam("category") String categoryName,
                                                      @RequestParam("numQuestions") Integer numQuestions) {
        return questionService.getQuestionsForQuiz(categoryName,numQuestions);
    }
    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds) {
        return questionService.getQuestionFromId(questionIds);
    }
    @PostMapping("/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses)
    {
        System.out.println(responses);
        return questionService.getScore(responses);
    }

}

