package com.masternerds.entity.survey;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


//TODO Use Lombok - Natalia task

@Entity
public class SurveyQuestion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	@OneToMany
	private List<Survey> surveys;
	
	@OneToMany
	private List<SurveyQuestionAnswer> surveyQuestionAnswers;

	
	public SurveyQuestion() {
		
	}
	
	public SurveyQuestion(Long id, String description, List<Survey> surveys) {
		super();
		this.id = id;
		this.description = description;
		this.surveys = surveys;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Survey> getSurveys() {
		return surveys;
	}

	public void setSurveys(List<Survey> surveys) {
		this.surveys = surveys;
	}

	public List<SurveyQuestionAnswer> getSurveyQuestionAnswers() {
		return surveyQuestionAnswers;
	}

	public void setSurveyQuestionAnswers(List<SurveyQuestionAnswer> surveyQuestionAnswers) {
		this.surveyQuestionAnswers = surveyQuestionAnswers;
	}
	
}
