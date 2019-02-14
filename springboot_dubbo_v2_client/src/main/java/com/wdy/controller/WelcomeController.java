package com.wdy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wdy.dubbo.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private WelcomeService welcomeService;

    @GetMapping("/sayWelcome")
    public String sayWelcome() {
        return welcomeService.sayWelcome();
    }
}
