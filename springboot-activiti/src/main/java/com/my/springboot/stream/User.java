package com.my.springboot.stream;

import lombok.Data;

@Data
public class User {
    private String name ;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
