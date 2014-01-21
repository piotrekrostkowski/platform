package com.platform.exercises;

import com.platform.lessons.VocabularyHome;
import com.platform.menus.MenuHome;
import com.platform.model.*;
import com.platform.model.exercises.Exercises;
import com.platform.model.exercises.ExercisesType;
import com.platform.model.exercises.Questions;
import com.platform.model.lessons.Vocabulary;
import com.platform.model.menus.Menu;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("exercisesHome")
public class ExercisesHome extends EntityHome<Exercises> {

	@In(create = true)
	ExercisesTypeHome exercisesTypeHome;
	@In(create = true)
	MenuHome menuHome;
	@In(create = true)
	QuestionsHome questionsHome;
	@In(create = true)
	VocabularyHome vocabularyHome;

	public void setExercisesId(Integer id) {
		setId(id);
	}

	public Integer getExercisesId() {
		return (Integer) getId();
	}

	@Override
	protected Exercises createInstance() {
		Exercises exercises = new Exercises();
		return exercises;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
		ExercisesType exercisesType = exercisesTypeHome.getDefinedInstance();
		if (exercisesType != null) {
			getInstance().setExercisesType(exercisesType);
		}
		Menu menu = menuHome.getDefinedInstance();
		if (menu != null) {
			getInstance().setMenu(menu);
		}
		Questions questions = questionsHome.getDefinedInstance();
		if (questions != null) {
			getInstance().setQuestions(questions);
		}
		Vocabulary vocabulary = vocabularyHome.getDefinedInstance();
		if (vocabulary != null) {
			getInstance().setVocabulary(vocabulary);
		}
	}

	public boolean isWired() {
		return true;
	}

	public Exercises getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
