package com.survey.survey.application.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("test")
class PingAPI {

    @GetMapping("/ping")
    fun ping(): String {
        return "pong"
    }

}