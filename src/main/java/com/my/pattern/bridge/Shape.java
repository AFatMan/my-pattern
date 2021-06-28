package com.my.pattern.bridge;

import lombok.Getter;
import lombok.Setter;

public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    protected abstract void draw();
}
