package com.platform.exercises;

import com.platform.menus.MenuHome;
import com.platform.model.*;
import com.platform.model.exercises.Exercises;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Name("exercisesList")
public class ExercisesList extends EntityQuery<Exercises> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2259922185541389106L;

	private static final String EJBQL = "select exercises from Exercises exercises where menu.id=#{selectedMenuValues.exercise}";

	private static final String[] RESTRICTIONS = {"exercises.menu.id=#{selectedMenuValues.exercise}",};


	private Exercises exercises = new Exercises();
	
	public ExercisesList() {
		setEjbql(EJBQL);
		setMaxResults(4);
		//setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
	}

	public Exercises getExercises() {
		return exercises;
	}
	
	/*
	public Set<Exercises> randomExercises(){
		int elementsCount=6;
		menuHome.setId(12);
	 
		Set<Exercises> randomExercises = new HashSet<Exercises>(0);
		
		
		Exercises[] exercisesArray=menuHome.getInstance().getExerciseses().toArray(new Exercises[menuHome.getInstance().getExerciseses().size()]);
		
		for (int i = 0; i < elementsCount; i++) {
			Random random = new Random();
			int randomInt=random.nextInt(exercisesArray.length);
			
			if (!randomExercises.contains(exercisesArray[randomInt])){
				randomExercises.add(exercisesArray[randomInt]);
			}else{
				randomInt=random.nextInt(exercisesArray.length);
				randomExercises.add(exercisesArray[randomInt]);
			}
			
		}
		
		return randomExercises;
		
	}
	*/
}
