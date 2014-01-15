package com.platform.exercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.event.ValueChangeEvent;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import com.icesoft.faces.component.ext.HtmlSelectOneMenu;
import com.platform.model.exercises.Answers;


@Scope(ScopeType.SESSION)
@Name("selectedAnswer")
public class SelectedAnswer implements Serializable{

	private static final long serialVersionUID = 2546844518555351703L;
	
	Answers[] answers = new Answers[5];
	Answers answer;

	public SelectedAnswer() {
		
	}
	
	public Boolean init(){

		if (answers.length==0){
		Answers answer = new Answers();
		for (int i = 0; i <= 5; i++) {
			answers[i]=answer;
		}
		}
	
		return true;
	}
	
	
	
	

	public Answers[] getAnswers() {
		return answers;
	}

	public void setAnswers(Answers[] answers) {
		this.answers = answers;
	}

	public void change(ValueChangeEvent e){
		Answers newAnswer = (Answers)e.getNewValue();
		
		UIComponent component=e.getComponent();
		((HtmlSelectOneMenu)component).setDisabled(true);
		if (newAnswer.getCorrect()){
		((HtmlSelectOneMenu)component).setStyle("color:green;");
		}else{
			((HtmlSelectOneMenu)component).setStyle("color:red;");
		}
	}
	
	public Answers lastAddedAnswer(){
		
		Answers lastAdded = null;
		
		for (Answers answer : answers) {
			
			if (answer != null)
			{
				lastAdded=answer;
			}
			
		}
		
		return lastAdded;
		
	}

	public Answers getAnswer() {
		return answer;
	}

	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	public int goodAnswersCount(){
		int count=0;
		for (Answers answer : answers) {
			if (answer != null && answer.getCorrect()){
				count++;
			}
		}
		return count;
		
	}
	
	public int badAnswersCount(){
		int count=0;
		for (Answers answer : answers) {
			if (answer != null && !answer.getCorrect()){
				count++;
			}
		}
		return count;
		
	}
	
	
}
