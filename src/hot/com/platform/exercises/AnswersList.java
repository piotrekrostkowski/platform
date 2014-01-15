package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.Answers;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("answersList")
public class AnswersList extends EntityQuery<Answers> {

	private static final String EJBQL = "select answers from Answers answers where id <= 3";

	private static final String[] RESTRICTIONS = {"lower(answers.value) like lower(concat(#{answersList.answers.value},'%'))",};

	private Answers answers = new Answers();

	public AnswersList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Answers getAnswers() {
		return answers;
	}
}
