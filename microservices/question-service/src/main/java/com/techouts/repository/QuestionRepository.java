package com.techouts.repository;


import com.techouts.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Questions,Integer>{

    List<Questions> findByCategory(String category);

    @Query(value = "select q.id from Questions q where q.category = :category order by random() limit :numQuestions",nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(@Param("category") String categoryName,@Param("numQuestions") Integer numQuestions);

}