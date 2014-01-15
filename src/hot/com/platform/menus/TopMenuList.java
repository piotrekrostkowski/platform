package com.platform.menus;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.platform.model.menus.Menu;

@Name("topMenuList")
public class TopMenuList extends EntityQuery<Menu> {


	private static final long serialVersionUID = -9077791316782669353L;


	private static final String EJBQL = "select menu from Menu menu where superior.id is null";
	



	private Menu menu = new Menu();

	public TopMenuList() {
		setEjbql(EJBQL);
	
	}

	public Menu getMenu() {
		return menu;
	}
}
