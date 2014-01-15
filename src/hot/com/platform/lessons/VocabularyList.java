package com.platform.lessons;

import com.platform.model.*;
import com.platform.model.lessons.Vocabulary;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("vocabularyList")
public class VocabularyList extends EntityQuery<Vocabulary> {

	private static final String EJBQL = "select vocabulary from Vocabulary vocabulary";

	private static final String[] RESTRICTIONS = {
			"lower(vocabulary.english) like lower(concat(#{vocabularyList.vocabulary.english},'%'))",
			"lower(vocabulary.mp3) like lower(concat(#{vocabularyList.vocabulary.mp3},'%'))",
			"lower(vocabulary.picture) like lower(concat(#{vocabularyList.vocabulary.picture},'%'))",
			"lower(vocabulary.polish) like lower(concat(#{vocabularyList.vocabulary.polish},'%'))",};

	private Vocabulary vocabulary = new Vocabulary();

	public VocabularyList() {
		setEjbql(EJBQL);
		//setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		//setMaxResults(25);
	}

	public Vocabulary getVocabulary() {
		return vocabulary;
	}
}
