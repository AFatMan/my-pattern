package com.my.pattern.proxy;

public class Coder implements Worker{
    @Override
    public void work() {
        System.out.println("do ta go go go");
    }

    @Override
    public void sleep() {
        System.out.println("sleep 2 hours");

    }
}
