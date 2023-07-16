package com.survey.survey.domain.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*


@Entity
@Table(name="survey")
data class Survey(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "name", nullable = false, length = 64)
    val name: String = "",

    @Column(name = "description", nullable = false, length = 512)
    val description: String = "",

    @Column(name = "uuid", nullable = false, length = 36)
    val uuid: UUID = UUID.randomUUID(),

    @Column(name = "is_active", nullable = false)
    val isActive: Boolean = false,

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    val createdAt: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),

    @OneToMany(cascade = [CascadeType.REMOVE], mappedBy = "survey")
    val questions: List<Question>? = null
)