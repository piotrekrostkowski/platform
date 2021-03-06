package com.platform.model.exercises;
// Generated 2014-01-08 12:50:14 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * ExercisesAnswers generated by hbm2java
 */
@Entity
@Table(name = "exercises_answers", catalog = "platform")
public class ExercisesAnswers implements java.io.Serializable {


	private static final long serialVersionUID = 4457383767329760007L;
	
	private Integer id;
	private Answers answers;
	private Exercises exercises;

	public ExercisesAnswers() {
	}

	public ExercisesAnswers(Answers answers, Exercises exercises) {
		this.answers = answers;
		this.exercises = exercises;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ANSWER_ID", nullable = false)
	@NotNull
	public Answers getAnswers() {
		return this.answers;
	}

	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXERCISE_ID", nullable = false)
	@NotNull
	public Exercises getExercises() {
		return this.exercises;
	}

	public void setExercises(Exercises exercises) {
		this.exercises = exercises;
	}

}
