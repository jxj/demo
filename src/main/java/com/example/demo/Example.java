package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Example.class);
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        System.out.println("started spring boot..................");
    }
}
