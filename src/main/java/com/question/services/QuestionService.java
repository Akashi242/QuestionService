package com.question.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.impl.QuestionServiceImpl;
import com.question.repositories.QuestionRepo;

@Service
public class QuestionService implements QuestionServiceImpl{
	@Autowired
	QuestionRepo questionrepo;

	@Override
	public Question create(Question question) {
		
		return questionrepo.save(question);
	}

	@Override
	public List<Question> getAllQuestion() {
		
		return questionrepo.findAll();
	}

	@Override
	public Question getQuestion(Long id) {
		
		return questionrepo.findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
	}

	@Override
	public void deleteQuestion(Long id) {
		 questionrepo.deleteById(id);
		
	}

	@Override
	public List<Question> findQuestionsByQuizId(Long quizId) {
		
		return questionrepo.findByQuizId(quizId);
	}
	

}
