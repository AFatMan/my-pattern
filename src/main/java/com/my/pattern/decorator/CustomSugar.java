package com.my.pattern.decorator;

/**
 * ConcreteDecorator:具体的装饰器，具体实现向装饰对象添加功能。
 */
public class CustomSugar extends CustomCoffee{

    private Coffee coffee;

    public CustomSugar(Coffee coffee) {
        this.coffee =coffee;
    }

    @Override
    void describe() {
        coffee.describe();
        System.out.println("加点糖");
    }

    @Override
    int cost() {
        return coffee.cost()+3;
    }
}
