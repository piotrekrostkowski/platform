package com.platform.lessons;

import com.platform.model.*;
import com.platform.model.menus.MenuTypes;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("menuTypesList")
public class MenuTypesList extends EntityQuery<MenuTypes> {

	private static final String EJBQL = "select menuTypes from MenuTypes menuTypes";

	private static final String[] RESTRICTIONS = {
			"lower(menuTypes.name) like lower(concat(#{menuTypesList.menuTypes.name},'%'))",
			"lower(menuTypes.page) like lower(concat(#{menuTypesList.menuTypes.page},'%'))",};

	private MenuTypes menuTypes = new MenuTypes();

	public MenuTypesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public MenuTypes getMenuTypes() {
		return menuTypes;
	}
}
