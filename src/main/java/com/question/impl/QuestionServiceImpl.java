package com.question.impl;

import java.util.List;

import com.question.entities.Question;

public interface QuestionServiceImpl {
	Question create(Question question);
	List<Question> getAllQuestion();
	Question getQuestion(Long id);
	void deleteQuestion(Long id);
	List<Question> findQuestionsByQuizId(Long quizId);
}
