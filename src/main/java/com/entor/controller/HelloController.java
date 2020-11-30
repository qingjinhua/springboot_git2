package com.entor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private  int port;
    @GetMapping("/hello")
    public String hello(){
        return "hello git";
    }

    @GetMapping("/get")
    public String get(){
        return "服务器端口:"+port;
    }

}
