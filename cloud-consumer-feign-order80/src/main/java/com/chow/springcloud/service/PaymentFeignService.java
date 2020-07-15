package com.chow.springcloud.service;

import com.chow.springcloud.entities.CommonResult;
import com.chow.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @PostMapping(value = "/payment/get/{id}")
        //哪个地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}
