package com.my.pattern.bridge;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle() {
         System.out.println("绿圈圈");
    }
}
