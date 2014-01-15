package com.platform.menus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityHome;

import com.platform.model.exercises.Exercises;
import com.platform.model.menus.Menu;


@Name("menuHome")
public class MenuHome extends EntityHome<Menu> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 982617014215383023L;
	@In(create = true)
	MenuHome menuHome;

	public void setMenuId(Integer id) {
		setId(id);
	}

	public Integer getMenuId() {
		return (Integer) getId();
	}

	@Override
	protected Menu createInstance() {
		Menu menu = new Menu();
		return menu;
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

	public Menu getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Menu> getMenus() {
		return getInstance() == null ? null : new ArrayList<Menu>(getInstance()
				.getMenus());
	}


	public Menu getMenuById(Integer id){
		setId(id);
		return getInstance();
	}
	
	
 
	
}
