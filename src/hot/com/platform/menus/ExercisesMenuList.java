package com.platform.menus;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.platform.model.menus.Menu;

@Name("exercisesMenuList")
public class ExercisesMenuList extends EntityQuery<Menu> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4236450115850596854L;

	private static final String EJBQL = "select menu from Menu menu";

	private static final String[] RESTRICTIONS = {"menu.superior.id=#{selectedMenuValues.content}",};

	private Menu menu = new Menu();

	public ExercisesMenuList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
	
	}

	public Menu getMenu() {
		return menu;
	}
}
