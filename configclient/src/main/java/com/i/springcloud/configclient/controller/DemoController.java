package com.i.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("hi")
    public String hi(){
        return "I am port:"+port;
    }
}
