package com.mokh.quizapp.DAO;

import com.mokh.quizapp.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
