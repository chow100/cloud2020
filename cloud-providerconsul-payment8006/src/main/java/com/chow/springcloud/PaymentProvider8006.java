package com.chow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProvider8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProvider8006.class);
    }

}
