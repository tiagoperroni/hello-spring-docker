package com.tiagoperroni.hello.controller;

import com.tiagoperroni.hello.services.HelloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(value = "/{nome}")
    public String hello(@PathVariable String nome) {
        return this.helloService.hello(nome);
    }

}
