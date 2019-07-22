package com.example.eureka.consumer.controller;

import com.example.eureka.consumer.intf.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 11:52 2019/7/18
 * @ Description:
 * @ Modified By:
 * @ Version    : $
 */
@RestController
public class DcController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);

        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer1")
    public String dc1() {
        return dcClient.consumer();
    }
}
