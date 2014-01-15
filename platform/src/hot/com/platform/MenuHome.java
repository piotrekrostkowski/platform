package com.platform;

import com.platform.model.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("menuHome")
public class MenuHome extends EntityHome<Menu> {

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
	public List<Menu> getMenus_1() {
		return getInstance() == null ? null : new ArrayList<Menu>(getInstance()
				.getMenus_1());
	}

}
