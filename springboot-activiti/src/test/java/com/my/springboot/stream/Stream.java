package com.my.springboot.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Stream {
    @Test
    public  void test1(){
        List list= Arrays.asList(
                new User("aa",23),
                new User("ss",25),
                new User("dd",24),
                new User("cc",23),
                new User("ff",22),
                new User("gg",21)
                );
        System.out.println(new User("spark",23));
    }
}
