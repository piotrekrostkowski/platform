package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.Exercises;
import com.platform.model.exercises.ExercisesType;

import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exercisesTypeHome")
public class ExercisesTypeHome extends EntityHome<ExercisesType> {

	public void setExercisesTypeId(Integer id) {
		setId(id);
	}

	public Integer getExercisesTypeId() {
		return (Integer) getId();
	}

	@Override
	protected ExercisesType createInstance() {
		ExercisesType exercisesType = new ExercisesType();
		return exercisesType;
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

	public ExercisesType getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Exercises> getExerciseses() {
		return getInstance() == null ? null : new ArrayList<Exercises>(
				getInstance().getExerciseses());
	}

}
