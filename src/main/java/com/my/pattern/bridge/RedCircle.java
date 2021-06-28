package com.my.pattern.bridge;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle() {
        System.out.println("红色圈圈");
    }
}
