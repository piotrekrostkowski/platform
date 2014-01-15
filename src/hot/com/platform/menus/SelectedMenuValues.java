package com.platform.menus;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.event.ValueChangeEvent;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import com.platform.model.exercises.Exercises;

@Scope(ScopeType.SESSION)
@Name("selectedMenuValues")
public class SelectedMenuValues implements Serializable{
	
	private static final long serialVersionUID = 1963595002307295144L;
	
	Integer level;
	Integer lesson;
	Integer content;
	Integer exercise;
	Set<Exercises> exercises;

	
	
	
	public Set<Exercises> exercisesAnswerses() {
		return exercises;
	}
	public void setExercises(Set<Exercises> exercises) {
		this.exercises = exercises;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getLesson() {
		return lesson;
	}
	public void setLesson(Integer lesson) {
		this.lesson = lesson;
	}
	public Integer getContent() {
		return content;
	}
	public void setContent(Integer content) {
		this.content = content;
	}
	public Integer getExercise() {
		return exercise;
	}
	public void setExercise(Integer exercise) {
		this.exercise = exercise;
	}

	

	
	public Set<Exercises> getExercises() {
		return exercises;
	}


	

	
	
	
}
