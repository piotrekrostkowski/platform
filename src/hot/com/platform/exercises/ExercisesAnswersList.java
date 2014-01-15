package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.ExercisesAnswers;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("exercisesAnswersList")
public class ExercisesAnswersList extends EntityQuery<ExercisesAnswers> {

	private static final String EJBQL = "select exercisesAnswers from ExercisesAnswers exercisesAnswers";

	private static final String[] RESTRICTIONS = {};

	private ExercisesAnswers exercisesAnswers = new ExercisesAnswers();

	public ExercisesAnswersList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public ExercisesAnswers getExercisesAnswers() {
		return exercisesAnswers;
	}
}
