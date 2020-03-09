package com.littlenotes.springhelloworldweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project spring-hello-world-web
 * @Author sintong as 3/9/20.
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String home() {
        return "Hello World Spring Boot!";
    }
}
