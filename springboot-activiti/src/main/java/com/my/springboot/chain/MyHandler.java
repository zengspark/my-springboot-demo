package com.my.springboot.chain;

public class MyHandler extends  AbstractHandler implements  Handler {
    String  handlerName;

    public MyHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void operator() {
        System.out.println(handlerName);
        if (getHandler()!=null){
            getHandler().operator();
        }
    }

    public static void main(String[] args) {
        Handler  handler1=new MyHandler("hander_1");
        Handler  handler2=new MyHandler("hander_2");
        Handler  handler3=new MyHandler("hander_3");
        ((MyHandler) handler1).setHandler(handler2);
        ((MyHandler) handler2).setHandler(handler3);
        handler1.operator();
    }
}
