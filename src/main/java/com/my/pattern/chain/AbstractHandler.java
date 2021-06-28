package com.my.pattern.chain;

/**
 * 抽象处理人
 * 主要定义: 处理条件 , 下一处理点 ,抽象处理方法
 */
public abstract class AbstractHandler {

    int min = 5;
    int middle = 10;
    int max = 30;

    AbstractHandler nextHandler ;

    void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    abstract void handle(Staff staff);

}
