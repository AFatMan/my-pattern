package com.my.pattern.decorator;

/**
 * ConcreteComponent:具体的组件的对象，实现组件对象的接口(抽象类)，是被装饰器装饰的原始对象，即可以给这个对象动态的添加职责。
 */
public class NesCoffee extends Coffee{

    @Override
    void describe() {
        System.out.println("一杯雀巢咖啡");
    }

    @Override
    int cost() {
        return 10;
    }
}
