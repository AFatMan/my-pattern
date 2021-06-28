package com.my.pattern.template;

/**
 * 模板模式
 * 定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 *
 * 重点,不可改变算法结构,只可重新定义算法
 */
public class TemplateTest {

    public static void main(String[] args) {
        HR hr = new HR();
        hr.dayWork();
        Manager manager = new Manager();
        manager.dayWork();
        Coder coder = new Coder();
        coder.dayWork();
    }
}
