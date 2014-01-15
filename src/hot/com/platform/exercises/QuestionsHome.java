package com.platform.exercises;

import com.platform.model.*;
import com.platform.model.exercises.Exercises;
import com.platform.model.exercises.Questions;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("questionsHome")
public class QuestionsHome extends EntityHome<Questions> {

	
	public QuestionsHome() {
	
	}
	

	
	public void setQuestionsId(Integer id) {
		setId(id);
	}

	public Integer getQuestionsId() {
		return (Integer) getId();
	}

	@Override
	protected Questions createInstance() {
		Questions questions = new Questions();
		return questions;
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

	public Questions getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Exercises> getExerciseses() {
		return getInstance() == null ? null : new ArrayList<Exercises>(
				getInstance().getExerciseses());
	}



	
	
	
	
	
}
