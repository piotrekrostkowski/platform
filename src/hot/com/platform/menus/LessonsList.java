package com.platform.menus;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.platform.model.menus.Menu;

@Name("lessonsList")
public class LessonsList extends EntityQuery<Menu> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9105911711906208927L;

	private static final String EJBQL = "select menu from Menu menu";

	private static final String[] RESTRICTIONS = {"menu.superior.id=#{selectedMenuValues.level}",};

	private Menu menu = new Menu();

	public LessonsList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
	
	}

	public Menu getMenu() {
		return menu;
	}
}
