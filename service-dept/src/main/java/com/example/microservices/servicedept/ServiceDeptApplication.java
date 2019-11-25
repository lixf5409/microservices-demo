package com.example.microservices.servicedept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chengqianpeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDeptApplication.class, args);
    }

}
