package com.platform;

import com.platform.model.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("menuList")
public class MenuList extends EntityQuery<Menu> {

	private static final String EJBQL = "select menu from Menu menu";

	private static final String[] RESTRICTIONS = {"lower(menu.name) like lower(concat(#{menuList.menu.name},'%'))",};

	private Menu menu = new Menu();

	public MenuList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Menu getMenu() {
		return menu;
	}
}
