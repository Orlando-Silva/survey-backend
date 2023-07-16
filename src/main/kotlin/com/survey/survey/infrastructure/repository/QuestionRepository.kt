package com.survey.survey.infrastructure.repository

import com.survey.survey.domain.entity.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface QuestionRepository : JpaRepository<Question, Long> {

}