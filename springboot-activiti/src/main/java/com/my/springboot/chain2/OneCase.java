package com.my.springboot.chain2;

public class OneCase  extends   BaseCase {
    public OneCase(boolean isConsume) {
        super(isConsume);
    }

    @Override
    void doSomething() {
        System.out.println( "hander  by  OneCase hander");
    }
}
