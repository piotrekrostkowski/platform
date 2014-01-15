package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.Questions;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("questionsList")
public class QuestionsList extends EntityQuery<Questions> {

	private static final String EJBQL = "select questions from Questions questions";

	private static final String[] RESTRICTIONS = {"lower(questions.value) like lower(concat(#{questionsList.questions.value},'%'))",};

	private Questions questions = new Questions();

	public QuestionsList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Questions getQuestions() {
		return questions;
	}
}
