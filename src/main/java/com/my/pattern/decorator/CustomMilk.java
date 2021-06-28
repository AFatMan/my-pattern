package com.my.pattern.decorator;

/**
 * ConcreteDecorator:具体的装饰器，具体实现向装饰对象添加功能。
 */
public class CustomMilk extends CustomCoffee{

    private final Coffee coffee;

    @Override
    void describe() {
        coffee.describe();
        System.out.println("加点牛奶");
    }

    @Override
    int cost() {
        return coffee.cost()+2;
    }

    public CustomMilk(Coffee coffee) {
        this.coffee = coffee;
    }
}
