package com.my.springboot.chain2;

public class TowCase   extends   BaseCase {
    public TowCase(boolean isConsume) {
        super(isConsume);
    }

    @Override
    void doSomething() {
        System.out.println( "handler  by  Towhandler ");
    }

    public static void main(String[] args) {
        String input="1";
        OneCase oneCase=new OneCase("1".equals(input));
        TowCase towCase=new TowCase("2".equals(input));
        DefaultCase  defaultCase=new DefaultCase(true);
        oneCase.setNextCase(towCase);
        towCase.setNextCase(defaultCase);
        oneCase.handleRequest();
    }
}
