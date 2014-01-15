package com.platform.lessons;

import com.platform.model.*;
import com.platform.model.lessons.WordTypes;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("wordTypesHome")
public class WordTypesHome extends EntityHome<WordTypes> {

	public void setWordTypesId(Integer id) {
		setId(id);
	}

	public Integer getWordTypesId() {
		return (Integer) getId();
	}

	@Override
	protected WordTypes createInstance() {
		WordTypes wordTypes = new WordTypes();
		return wordTypes;
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

	public WordTypes getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
