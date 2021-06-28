package com.my.pattern.strategy.detail;

import com.my.pattern.strategy.IDisplayBehavior;

public class DisplayTShirt implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("老子穿t-shirt");
    }
}
