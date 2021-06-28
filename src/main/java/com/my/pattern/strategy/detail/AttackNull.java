package com.my.pattern.strategy.detail;

import com.my.pattern.strategy.IAttackBehavior;

public class AttackNull implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("我不会武功,tmd");
    }
}
