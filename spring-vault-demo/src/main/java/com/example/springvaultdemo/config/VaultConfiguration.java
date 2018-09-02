package com.example.springvaultdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;
import org.springframework.vault.core.VaultTemplate;

@Configuration
class VaultConfiguration extends AbstractVaultConfiguration {

    @Value("${vault.token}")
    private  String vaultToken;
    @Override
    public VaultEndpoint vaultEndpoint() {
        return new VaultEndpoint();
    }

    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication(vaultToken);
    }
    @Bean("vaultTemplate")
    public VaultTemplate vaultTemplate(){
        return  new VaultTemplate(vaultEndpoint(), clientAuthentication());
    }

}