package com.masternerds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masternerds.entity.survey.Survey;
import com.masternerds.service.SurveyService;

@RestController
@BasePathAwareController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value = "/survey/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Survey>> findAllSurvey() {
		return ResponseEntity.status(HttpStatus.OK).body(surveyService.findAllSurvey());
	}

}