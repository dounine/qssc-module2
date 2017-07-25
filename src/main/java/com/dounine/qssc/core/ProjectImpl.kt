package com.dounine.qssc.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.time.LocalDateTime

@Component
class ProjectImpl : IProject {

    @Autowired
    lateinit var restTemplate: RestTemplate;

    override fun getName(): String {

        return LocalDateTime.now().toString()
    }
}