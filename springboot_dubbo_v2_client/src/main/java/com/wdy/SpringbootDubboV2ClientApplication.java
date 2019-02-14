package com.wdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wdy.controller")
public class SpringbootDubboV2ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboV2ClientApplication.class, args);
    }

}

