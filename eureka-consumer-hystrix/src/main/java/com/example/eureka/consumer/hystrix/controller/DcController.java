package com.example.eureka.consumer.hystrix.controller;

import com.example.eureka.consumer.hystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 14:42 2019/7/18
 * @ Description:
 * @ Modified By:
 * @ Version    : $
 */
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
}
