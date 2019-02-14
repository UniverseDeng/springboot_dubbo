package com.wdy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class SpringbootDubboV2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboV2ServiceApplication.class, args);
    }

}

