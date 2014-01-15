package com.platform.model.lessons;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.mysql.jdbc.Blob;
import com.platform.model.menus.Menu;

@Entity
@Table(name="theory",catalog="platform")
public class Theory {
	
	private Integer id;
	private String name;
	private Blob value;
	private Menu menu;
	private Set<Vocabulary> vocabularies = new HashSet<Vocabulary>(0);
	
	public Theory() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ID",nullable=false,unique=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="VALUE")
	public Blob getValue() {
		return value;
	}

	public void setValue(Blob value) {
		this.value = value;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MENU_ID")
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	@Column(name="VALUE",length=100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OrderBy(value="picture desc")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "theory")
	public Set<Vocabulary> getVocabularies() {
		return vocabularies;
	}

	public void setVocabularies(Set<Vocabulary> vocabularies) {
		this.vocabularies = vocabularies;
	}
	

}
