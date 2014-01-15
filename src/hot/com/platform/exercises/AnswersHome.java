package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.Answers;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("answersHome")
public class AnswersHome extends EntityHome<Answers> {

	public void setAnswersId(Integer id) {
		setId(id);
	}

	public Integer getAnswersId() {
		return (Integer) getId();
	}

	@Override
	protected Answers createInstance() {
		Answers answers = new Answers();
		return answers;
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

	public Answers getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
