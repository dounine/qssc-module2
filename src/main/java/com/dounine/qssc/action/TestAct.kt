package com.dounine.qssc.action

import com.dounine.qssc.core.IProject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate



@RestController
class TestAct {

//    @Value("\${db.driver}")
//    lateinit var foo: String
    @Autowired
    lateinit var project: IProject

    @Autowired
    lateinit var restTemplate: RestTemplate;
    @Autowired
    lateinit var dcClient: TestClient;

    @GetMapping("test")
    fun test(): String {
        var oo = restTemplate.getForObject("http://qssc-module1/test",String::class.java);
        return "qssc-module2："+dcClient.test()
    }
}


