package com.platform.model.menus;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OrderBy;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.Length;

import com.platform.model.exercises.Exercises;
import com.platform.model.lessons.Theory;
import com.platform.model.lessons.Vocabulary;


@Entity
@Table(name = "menu", catalog = "platform")
public class Menu implements java.io.Serializable {

	private static final long serialVersionUID = 2828374990205354756L;
	
	private Integer id;
	
	private Menu superior;
	private String name;
	private Set<Menu> menus = new HashSet<Menu>(0);
	private MenuTypes menuType;
	private String description;
	private Set<Theory> theories = new HashSet<Theory>(0);
	private Set<Exercises> exerciseses = new HashSet<Exercises>(0);

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "menu")
	public Set<Exercises> getExerciseses() {
		return exerciseses;
	}
	
	

	public void setExerciseses(Set<Exercises> exerciseses) {
		this.exerciseses = exerciseses;
	}

	public Menu() {
	}

	public Menu(Menu superior, String name, Set<Menu> menus) {
		this.superior = superior;
		this.name = name;
		this.menus = menus;
	
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
	@JoinColumn(name = "SUPERIOR_ID")
	public Menu getSuperior() {
		return superior;
	}

	public void setSuperior(Menu superior) {
		this.superior = superior;
	}

	@Column(name = "NAME", length = 100)
	@Length(max = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "superior")
	public Set<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TYPE_ID")
	public MenuTypes getMenuType() {
		return menuType;
	}

	public void setMenuType(MenuTypes menuType) {
		this.menuType = menuType;
	}


	@Column(name = "DESCRIPTION", length = 200)
	@Length(max = 200)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


	@OrderBy(value="id asc")
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="menu")
	public Set<Theory> getTheories() {
		return theories;
	}



	public void setTheories(Set<Theory> theories) {
		this.theories = theories;
	}

	

	
	
	

	
	
}
