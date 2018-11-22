package com.example.springcloudcontractdemo.controller;

import java.io.Serializable;

public class Person implements Serializable {

   private String firstName;
   private String lastName;
   private int age;
   private  Courses courses;

   public Person(String firstName, String lastName, int age, Courses courses) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.courses =  courses;
   }

   public String getFirstName() {
       return firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public int getAge() {
       return age;
   }

   public Courses getCourses() {
       return courses;
   }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
