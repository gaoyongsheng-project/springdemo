package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWordController {

    @RequestMapping("/")//请求路径
    public String handler(){
        return "Hello Spring Boot!";
    }
}
