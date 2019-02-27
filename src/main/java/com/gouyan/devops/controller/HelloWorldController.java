package com.gouyan.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String helloWorld(){
    	try{

    	}catch(Exception e){
    		
    	}
        return "Hello World!";
    }
}
