package com.infy.in.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
    @GetMapping("/message")
     public String message(){
         return "congrats uday good job super good";

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
