package com.dounine.qssc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lake on 17-2-28.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dounine.qssc"})
@EnableAutoConfiguration(exclude = {ValidationAutoConfiguration.class})
//@EnableDiscoveryClient
@EnableEurekaClient
public class Application {

    @Primary
    @LoadBalanced
    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
