package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.ExercisesType;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("excercisesTypeList")
public class ExercisesTypeList extends EntityQuery<ExercisesType> {

	private static final String EJBQL = "select exercisesType from ExercisesType exercisesType";

	private static final String[] RESTRICTIONS = {"lower(exercisesType.name) like lower(concat(#{exercisesTypeList.exercisesType.name},'%'))",};

	private ExercisesType exercisesType = new ExercisesType();

	public ExercisesTypeList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public ExercisesType getExercisesType() {
		return exercisesType;
	}
}
