package com.masternerds.shared;

import java.util.ArrayList;
import java.util.List;

import com.masternerds.entity.survey.Survey;
import com.masternerds.entity.survey.SurveyQuestion;
import com.masternerds.entity.survey.SurveyQuestionAnswer;

public class SurveyTest {
	
	public List<Survey> prepareSurveyDataMock() {
		List<Survey> surveys = new ArrayList<Survey>();
		
		//Survey 1
		Survey survey1 = new Survey();
		List<Survey> surveyList1 = new ArrayList<Survey>();
		surveyList1.add(survey1);
		
		SurveyQuestion question1Survey1 = new SurveyQuestion(1l, "Which film will you watch?", surveyList1);
		SurveyQuestionAnswer anwer1Question1 = new SurveyQuestionAnswer(1l, "Tenent", question1Survey1);
		SurveyQuestionAnswer anwer2Question1 = new SurveyQuestionAnswer(2l, "Scooby Doo", question1Survey1);
		List<SurveyQuestionAnswer> survey1Answers = new ArrayList<>();
		survey1Answers.add(anwer1Question1);
		survey1Answers.add(anwer2Question1);
		question1Survey1.setSurveyQuestionAnswers(survey1Answers);
		
		SurveyQuestion question2Survey1 = new SurveyQuestion(1l, "Are you student?", surveyList1);
		SurveyQuestionAnswer anwer1Question2Survey1 = new SurveyQuestionAnswer(1l, "Yes", question2Survey1);
		SurveyQuestionAnswer anwer2Question2Survey1 = new SurveyQuestionAnswer(2l, "No", question2Survey1);
		List<SurveyQuestionAnswer> survey1AnswersQuestion2 = new ArrayList<>();
		survey1AnswersQuestion2.add(anwer1Question2Survey1);
		survey1AnswersQuestion2.add(anwer2Question2Survey1);
		question1Survey1.setSurveyQuestionAnswers(survey1AnswersQuestion2);
		
		List<SurveyQuestion> survey1Questions = new ArrayList<SurveyQuestion>();
		survey1Questions.add(question1Survey1);
		survey1Questions.add(question2Survey1);
		survey1.setSurveyQuestions(survey1Questions);
		
		//Survey 2
		Survey survey2 = new Survey();
		List<Survey> surveyList2 = new ArrayList<Survey>();
		surveyList1.add(survey2);
		SurveyQuestion question1Survey2 = new SurveyQuestion(1l, "Which film will you watch?", surveyList2);
		SurveyQuestionAnswer anwer1Question1Survey2 = new SurveyQuestionAnswer(1l, "Tenent", question1Survey2);
		SurveyQuestionAnswer anwer2Question1Survey2 = new SurveyQuestionAnswer(2l, "Scooby Doo", question1Survey2);
		List<SurveyQuestionAnswer> survey2AnswersQuestion1 = new ArrayList<>();
		survey2AnswersQuestion1.add(anwer1Question1Survey2);
		survey2AnswersQuestion1.add(anwer2Question1Survey2);
		question1Survey2.setSurveyQuestionAnswers(survey2AnswersQuestion1);
		
		SurveyQuestion question2Survey2 = new SurveyQuestion(1l, "Are you student?", surveyList2);
		SurveyQuestionAnswer anwer1Question2Survey2 = new SurveyQuestionAnswer(1l, "Yes", question2Survey2);
		SurveyQuestionAnswer anwer2Question2Survey2 = new SurveyQuestionAnswer(2l, "No", question2Survey2);
		List<SurveyQuestionAnswer> survey2AnswersQuestion2 = new ArrayList<>();
		survey2AnswersQuestion2.add(anwer1Question2Survey2);
		survey2AnswersQuestion2.add(anwer2Question2Survey2);
		question2Survey2.setSurveyQuestionAnswers(survey2AnswersQuestion2);
		
		List<SurveyQuestion> survey2Questions = new ArrayList<SurveyQuestion>();
		survey2Questions.add(question1Survey2);
		survey2Questions.add(question2Survey2);
		survey2.setSurveyQuestions(survey2Questions);
		
		//Set Surveys
		surveys.add(survey1);
		surveys.add(survey2);
		
		return surveys;
	}
	
	//TODO for future methods like findById(..)/create(..)/update(..)/delete(..)
	public Survey prepareRequest() {
		
		return null;
	}

}
