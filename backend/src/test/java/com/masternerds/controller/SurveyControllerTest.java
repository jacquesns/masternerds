package com.masternerds.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.masternerds.entity.survey.Survey;
import com.masternerds.entity.survey.SurveyQuestion;
import com.masternerds.entity.survey.SurveyQuestionAnswer;
import com.masternerds.repository.SurveyRepository;
import com.masternerds.service.SurveyService;
import com.masternerds.shared.SurveyTest;

@RunWith(MockitoJUnitRunner.class)
public class SurveyControllerTest extends SurveyTest {

	@InjectMocks
	SurveyController surveyController;
	@Mock
	SurveyService surveyService;
	@Mock
	SurveyRepository surveyRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testFindAll() {
		when(surveyService.findAllSurvey()).thenReturn(prepareSurveyDataMock());
		ResponseEntity<List<Survey>> surveysResponse = surveyController.findAllSurvey();
		assertEquals(200, surveysResponse.getStatusCodeValue());
	}
	
}
