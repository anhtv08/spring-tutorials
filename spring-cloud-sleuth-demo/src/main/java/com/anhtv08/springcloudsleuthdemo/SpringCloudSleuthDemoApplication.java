package com.anhtv08.springcloudsleuthdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudSleuthDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSleuthDemoApplication.class, args);
    }
}
