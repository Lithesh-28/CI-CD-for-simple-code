package com.litheshShetty.Docker_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/greet")
    public String greet(){
        return "Hello World";
    }

}
