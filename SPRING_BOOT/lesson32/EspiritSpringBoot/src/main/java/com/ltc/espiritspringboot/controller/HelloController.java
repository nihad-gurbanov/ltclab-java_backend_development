package com.ltc.espiritspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Home Page";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye World";
    }

    @GetMapping("/bye{name}")
    public String bye(@PathVariable String name) {
        return "Bye " + name;
    }
}
