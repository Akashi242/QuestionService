package com.question.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionService questionservice;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionservice.create(question);
	}
	
	@GetMapping
	public List<Question> getallquestion()
	{
		return questionservice.getAllQuestion();
	}
	@GetMapping("/{id}")
	public Question getquestion(@PathVariable Long id) {
		return questionservice.getQuestion(id);
	}
	
	@GetMapping("quiz/{quizId}")
	public List<Question> getquestionBtquizId(@PathVariable Long quizId){
		return questionservice.findQuestionsByQuizId(quizId);
	}
	
	@DeleteMapping("/{id}")
	public void deletequestion(@PathVariable Long id) {
		questionservice.deleteQuestion(id);
	}

}
