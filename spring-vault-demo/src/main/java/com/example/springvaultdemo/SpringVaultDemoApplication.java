package com.example.springvaultdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultToken;

import java.net.URI;

@SpringBootApplication
public class SpringVaultDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringVaultDemoApplication.class, args);
    }
}
