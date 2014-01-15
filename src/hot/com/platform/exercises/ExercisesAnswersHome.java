package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.ExercisesAnswers;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exercisesAnswersHome")
public class ExercisesAnswersHome extends EntityHome<ExercisesAnswers> {

	public void setExercisesAnswersId(Integer id) {
		setId(id);
	}

	public Integer getExercisesAnswersId() {
		return (Integer) getId();
	}

	@Override
	protected ExercisesAnswers createInstance() {
		ExercisesAnswers exercisesAnswers = new ExercisesAnswers();
		return exercisesAnswers;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public ExercisesAnswers getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
