package com.techouts.spring_security.dao;


import com.techouts.spring_security.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {


}
