package com.ggemo.callingCard.consumer;

import com.ggemo.callingCard.DemoService;

import org.apache.dubbo.config.annotation.Reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class DubboConsumerBootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

//    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    @Reference
    private DemoService demoService;

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboConsumerBootstrap.class).run(args);
//        SpringApplication.run(DubboConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        logger.info(demoService.sayHello("Provider"));
        return args -> logger.info(demoService.hello2());
    }
}
