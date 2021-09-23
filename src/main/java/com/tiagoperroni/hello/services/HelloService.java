package com.tiagoperroni.hello.services;

import com.tiagoperroni.hello.entity.HelloEntity;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        HelloEntity hello = new HelloEntity(name);
        return hello.helloName();

    }    
}
