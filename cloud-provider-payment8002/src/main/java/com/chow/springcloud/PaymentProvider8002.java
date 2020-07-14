package com.chow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProvider8002.class);
    }

}
