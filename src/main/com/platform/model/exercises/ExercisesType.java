package com.platform.model.exercises;
// Generated 2013-12-28 23:50:43 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;


@Entity
@Table(name = "exercises_type", catalog = "platform")
public class ExercisesType implements java.io.Serializable {


	private static final long serialVersionUID = 1817362981538252202L;
	
	private Integer id;
	private String name;
	private Set<Exercises> exerciseses = new HashSet<Exercises>(0);
	private String component;

	public ExercisesType() {
	}

	public ExercisesType(String name, Set<Exercises> exerciseses) {
		this.name = name;
		this.exerciseses = exerciseses;
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

	@Column(name = "NAME", length = 20)
	@Length(max = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "exercisesType")
	public Set<Exercises> getExerciseses() {
		return this.exerciseses;
	}

	public void setExerciseses(Set<Exercises> exerciseses) {
		this.exerciseses = exerciseses;
	}
	
	
	@Column(name = "COMPONENT", length = 50)
	@Length(max = 50)
	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	
	
}
