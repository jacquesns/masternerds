package com.masternerds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masternerds.entity.survey.Survey;
import com.masternerds.repository.SurveyRepository;

@Service
public class SurveyService {

	@Autowired
	private SurveyRepository surveyRepository;
	
	
	public List<Survey> findAllSurvey() {
		return surveyRepository.findAll();
	}
	
}