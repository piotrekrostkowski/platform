package com.platform.lessons;

import com.platform.model.*;
import com.platform.model.lessons.WordTypes;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("wordTypesList")
public class WordTypesList extends EntityQuery<WordTypes> {

	private static final String EJBQL = "select wordTypes from WordTypes wordTypes";

	private static final String[] RESTRICTIONS = {"lower(wordTypes.name) like lower(concat(#{wordTypesList.wordTypes.name},'%'))",};

	private WordTypes wordTypes = new WordTypes();

	public WordTypesList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public WordTypes getWordTypes() {
		return wordTypes;
	}
}
