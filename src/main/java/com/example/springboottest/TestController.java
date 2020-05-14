package com.example.springboottest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/handler")
    public String handler(){
        return "ok";
    }
}
