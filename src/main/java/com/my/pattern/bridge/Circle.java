package com.my.pattern.bridge;

public class Circle extends Shape{

    public Circle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    protected void draw() {
        drawApi.drawCircle();
    }
}
