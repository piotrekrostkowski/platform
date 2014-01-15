package com.platform.lessons;

import com.platform.model.*;
import com.platform.model.menus.Menu;
import com.platform.model.menus.MenuTypes;

import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("menuTypesHome")
public class MenuTypesHome extends EntityHome<MenuTypes> {

	public void setMenuTypesId(Integer id) {
		setId(id);
	}

	public Integer getMenuTypesId() {
		return (Integer) getId();
	}

	@Override
	protected MenuTypes createInstance() {
		MenuTypes menuTypes = new MenuTypes();
		return menuTypes;
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

	public MenuTypes getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}



}
