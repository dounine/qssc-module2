package com.dounine.qssc.action

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("qssc-module1")
interface TestClient {

    @GetMapping("test")
    fun test():String
}