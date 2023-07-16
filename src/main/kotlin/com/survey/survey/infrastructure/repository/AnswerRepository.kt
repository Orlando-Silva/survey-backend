package com.survey.survey.infrastructure.repository

import com.survey.survey.domain.entity.Answer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface AnswerRepository : JpaRepository<Answer, Long> {

}