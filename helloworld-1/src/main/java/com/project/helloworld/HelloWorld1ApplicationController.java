package com.project.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld1ApplicationController {

	@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
    	
    	String formatname = name.toUpperCase();
        return "<h1> Hello,<h1>" + formatname;
    }

}
