package com.example.springvaultdemo.controller;

import com.example.springvaultdemo.domain.MySecretData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloVaultController {

    @Autowired
    private  VaultTemplate vaultTemplate;

    @RequestMapping("/vault/retrieve/{userKey}")
    public String hello(@RequestParam("userKey") String userKey ){
        VaultResponseSupport<MySecretData> response = vaultTemplate.read("/secret/myapplication/user/" + userKey, MySecretData.class);
        return  response.getData().getPassword();

    }
    @RequestMapping("/vault/store/{userKey}/{password}")
    public void addUserPasspord(@RequestParam("userKey") String userKey, @RequestParam("password") String password){

        MySecretData mySecretData = new MySecretData(userKey, password);
        vaultTemplate.write("/secret/myapplication/user/" + userKey, mySecretData);

    }
}
