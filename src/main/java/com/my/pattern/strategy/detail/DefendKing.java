package com.my.pattern.strategy.detail;

import com.my.pattern.strategy.IDefendBehavior;

public class DefendKing implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("老子会金钟罩");
    }
}
