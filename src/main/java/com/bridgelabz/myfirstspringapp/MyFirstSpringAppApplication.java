package com.bridgelabz.myfirstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringAppApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to my first spring app");
        SpringApplication.run(MyFirstSpringAppApplication.class, args);
    }
}
