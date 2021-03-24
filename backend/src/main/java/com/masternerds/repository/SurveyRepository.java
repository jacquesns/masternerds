package com.masternerds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masternerds.entity.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long>{

}
