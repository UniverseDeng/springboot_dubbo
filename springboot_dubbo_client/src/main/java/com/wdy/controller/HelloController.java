package com.wdy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wdy.dubbo.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
