package com.my.pattern.strategy.detail;

import com.my.pattern.strategy.IAttackBehavior;

public class AttackDragon implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("老子也会降龙十八掌");
    }
}
