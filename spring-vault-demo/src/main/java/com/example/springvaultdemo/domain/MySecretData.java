package com.example.springvaultdemo.domain;

import java.io.Serializable;

public class MySecretData implements Serializable {
    private String username;
    private String password;

    public MySecretData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
