package com.platform.model.menus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu_types", catalog = "platform")
public class MenuTypes {

	Integer id;
	String Name;
	String Page;

	public MenuTypes() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique=true,nullable=false)
	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="name",length=20)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@Column(name="page",length=50)
	public String getPage() {
		return Page;
	}

	public void setPage(String page) {
		Page = page;
	}

	
	
	
}
