package com.techouts.repository;

import com.techouts.model.Questions;
import com.techouts.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {

    @Query(value = "SELECT * From questions q where q.category = :category order by random() limit :numQ",nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(String category, int numQ);
}
