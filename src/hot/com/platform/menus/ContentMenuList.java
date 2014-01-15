package com.platform.menus;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.platform.model.menus.Menu;

@Name("contentMenuList")
public class ContentMenuList extends EntityQuery<Menu> {


	private static final long serialVersionUID = -6027960803709825475L;

	private static final String EJBQL = "select menu from Menu menu";

	private static final String[] RESTRICTIONS = {"menu.superior.id=#{selectedMenuValues.lesson}",};

	private Menu menu = new Menu();

	public ContentMenuList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
	
	}

	public Menu getMenu() {
		return menu;
	}
}
