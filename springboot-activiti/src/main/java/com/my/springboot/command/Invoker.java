package com.my.springboot.command;

public class Invoker {
    private   Command   command;

    public Invoker(Command command) {
        this.command = command;
    }
    public   void  action(){
        command.exec();
    }

    public static void main(String[] args) {
        Command command=new MyCommand(new Receiver());
        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}
