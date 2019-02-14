package com.wdy.dubbo.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.wdy.dubbo.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello , "+name;
    }
}
