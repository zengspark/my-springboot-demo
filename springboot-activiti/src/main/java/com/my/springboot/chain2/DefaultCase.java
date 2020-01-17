package com.my.springboot.chain2;



//默认的处理者，或最终的处理者
public class DefaultCase  extends BaseCase {
    public DefaultCase(boolean isConsume) {
        super(isConsume);
    }

    @Override
    void doSomething() {
        System.out.println( "default handler");
    }
}
