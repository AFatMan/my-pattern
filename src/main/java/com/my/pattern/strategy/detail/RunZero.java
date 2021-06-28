package com.my.pattern.strategy.detail;

import com.my.pattern.strategy.IRunBehavior;

public class RunZero implements IRunBehavior {
    @Override
    public void run() {
        System.out.println("0波微步");
    }
}
