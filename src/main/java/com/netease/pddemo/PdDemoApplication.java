package com.netease.pddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PdDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PdDemoApplication.class, args);
    }

    @GetMapping("/")
    public String good() {
        return "ok";
    }

    @GetMapping("/health")
    public String health(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s, I'm fine", name);
    }

}
