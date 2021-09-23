package com.tiagoperroni.hello.entity;

public class HelloEntity {

    private String name;

    public HelloEntity() {
    }

    public HelloEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String helloName() {
        return "Hello " + this.name;
    }
}
