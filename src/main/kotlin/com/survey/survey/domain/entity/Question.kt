package com.survey.survey.domain.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.time.ZoneOffset

@Entity
@Table(name="question")
data class Question(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0,

    @Column(name = "description", nullable = false, length = 512)
    private val description: String = "",

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    private val createdAt: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),

    @ManyToOne
    @JoinColumn(name="survey_id", nullable=false)
    private val survey: Survey? = null,

    @OneToMany(cascade = [CascadeType.REMOVE], mappedBy = "question")
    private val answers: List<Answer>? = null

)