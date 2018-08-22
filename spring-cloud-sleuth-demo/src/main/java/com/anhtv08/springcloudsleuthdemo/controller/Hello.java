package com.anhtv08.springcloudsleuthdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Hello {

    private static Logger logger = LoggerFactory.getLogger(Hello.class);
    @RequestMapping("/")
    public String hello()
    {

        MDC.put("serviceName", "app example");
        MDC.put("userId", "Joey");
        MDC.put("guid", UUID.randomUUID().toString());
        logger.info("this is test for kafka appender");
        return  "hello spring boot app";
    }
}
