package com.i.springcloud.hystrix.turbine.controller;

import com.i.springcloud.hystrix.turbine.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(String name){
        return helloService.hi(name);
    }

}
