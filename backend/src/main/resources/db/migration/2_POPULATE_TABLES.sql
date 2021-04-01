
#ALLOWS DELETE FROM WITHOUT USING WHERE CLAUSE - JUST FOR LOCAL TESTS
SET SQL_SAFE_UPDATES = 0;

# SURVEY QUESTION
delete from masterNerdsDatabase.survey_question;

insert into masterNerdsDatabase.survey_question(id, description) values (1, 'Which film are you interested in today?');
insert into masterNerdsDatabase.survey_question(id, description) values (2, 'Which car brand are you into buying?');


# SURVEY QUESTIONS ANSWERS
delete from masterNerdsDatabase.survey_question_answer;

insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (1, 'GreenLan', 1);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (2, 'Tenent', 1);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (3, 'Woner Woman 1984', 1);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (4, 'Monster Hunter', 1);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (5, 'Godzilla vs Kong', 1);

insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (6, 'Honda', 2);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (7, 'Porsche', 2);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (8, 'BMW', 2);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (9, 'Mercedes', 2);
insert into masterNerdsDatabase.survey_question_answer(id, description, question_id) values (10, 'Mazda', 2);

