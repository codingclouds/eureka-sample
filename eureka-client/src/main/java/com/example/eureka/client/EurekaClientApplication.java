package com.example.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //激活Eureka中的DiscoveryClient实现
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                EurekaClientApplication.class)
                .web(true).run(args);
//        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
