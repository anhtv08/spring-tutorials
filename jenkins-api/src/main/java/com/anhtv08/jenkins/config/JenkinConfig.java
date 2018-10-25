package com.anhtv08.jenkins.config;

import com.offbytwo.jenkins.JenkinsServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class JenkinConfig {

    @Bean
    public JenkinsServer jenkinsServer() throws URISyntaxException {
        JenkinsServer jenkins = new JenkinsServer
                (new URI("http://localhost:8080"),
                        "admin",
                        "password");
        return  jenkins;
    }
}
