package com.techouts.spring_security.feign;



import com.techouts.spring_security.model.QuestionWrapper;
import com.techouts.spring_security.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
    @GetMapping("/questions/generate")
    ResponseEntity<List<Integer>> getQuestionForQuiz(@RequestParam("category") String categoryName,
                                                     @RequestParam("numQuestions") Integer numQuestions);
    @PostMapping("/questions/getQuestions")
     ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds) ;
    @PostMapping("/questions/getScore")
     ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
