package com.my.pattern.flyweight;

import lombok.Data;

@Data
public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("左手跟我一起画个龙,右手一起画彩虹");
    }
}
