package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 11:32 2019/7/18
 * @ Description:
 * @ Modified By:
 * @ Version    : $
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        //熔断器验证，熔断
//        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
