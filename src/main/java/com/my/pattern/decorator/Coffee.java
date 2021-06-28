package com.my.pattern.decorator;

/**
 * Component:组件对象的抽象接口(抽象类)，可以给这些对象动态的增加职责/功能。
 */
public abstract class Coffee {

    abstract void describe();

    abstract int cost();
}
