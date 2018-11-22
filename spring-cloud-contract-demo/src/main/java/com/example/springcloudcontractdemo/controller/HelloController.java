package com.example.springcloudcontractdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value = "hello",
            produces = "application/json"

    )
    public List<Person> hello(){
        return Arrays.asList( new Person("Joey", "Trang", 10,
                new Courses("java-100", "java")));
//        return new Person("Joey", "Trang", 10);
    }


}

