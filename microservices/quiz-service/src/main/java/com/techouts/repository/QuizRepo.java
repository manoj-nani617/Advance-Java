package com.techouts.repository;

import com.techouts.model.Questions;
import com.techouts.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {


}
