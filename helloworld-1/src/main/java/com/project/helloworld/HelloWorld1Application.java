package com.project.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld1Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld1Application.class, args);
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
    	
    	String formatname = name.toUpperCase();
        return "<h1> Hello,<h1>" + formatname;
    }
}