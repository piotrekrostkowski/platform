package com.platform.lessons;

import com.platform.model.lessons.Vocabulary;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("vocabularyHome")
public class VocabularyHome extends EntityHome<Vocabulary> {

	public void setVocabularyId(Integer id) {
		setId(id);
	}

	public Integer getVocabularyId() {
		return (Integer) getId();
	}

	@Override
	protected Vocabulary createInstance() {
		Vocabulary vocabulary = new Vocabulary();
		return vocabulary;
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

	public Vocabulary getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
