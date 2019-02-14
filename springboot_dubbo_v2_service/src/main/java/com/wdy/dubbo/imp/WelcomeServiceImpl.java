package com.wdy.dubbo.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.wdy.dubbo.WelcomeService;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String sayWelcome() {
        return "welcome! first dubbo is ok!";
    }
}
