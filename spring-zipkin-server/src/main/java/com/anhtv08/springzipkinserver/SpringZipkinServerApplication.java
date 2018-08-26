package com.anhtv08.springzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringZipkinServerApplication.class, args);
    }
}
