package com.my.springboot.chain2;

public abstract  class BaseCase {
    //isConsume 为 true,则表示自己可以处理
    private   boolean isConsume;

    public BaseCase(boolean isConsume) {
        this.isConsume = isConsume;
    }
    //下一个处理人或处理节点
    private BaseCase nextCase;

    public BaseCase getNextCase() {
        return nextCase;
    }

    public void setNextCase(BaseCase nextCase) {
        this.nextCase = nextCase;
    }
    public   void  handleRequest(){
        if(isConsume){
            doSomething();
        }else{
            if(null!=nextCase){
                getNextCase().handleRequest();
            }

        }
    }
    abstract  void  doSomething();
}
