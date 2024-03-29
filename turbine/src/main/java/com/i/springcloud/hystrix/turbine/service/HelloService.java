package com.i.springcloud.hystrix.turbine.service;

import com.i.springcloud.hystrix.turbine.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client",fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping("/hello/sayName?name=")
    String hi(@RequestParam("name") String name);

}
