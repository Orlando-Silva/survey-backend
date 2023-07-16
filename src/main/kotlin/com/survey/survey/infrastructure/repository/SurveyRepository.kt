package com.survey.survey.infrastructure.repository

import com.survey.survey.domain.entity.Survey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface SurveyRepository : JpaRepository<Survey, Long> {

}