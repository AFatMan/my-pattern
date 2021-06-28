package com.my.pattern.chain;

public class PersonnelMatters extends AbstractHandler{
    @Override
    void handle(Staff staff) {
        System.out.println("拿个报告就走吧");
    }
}
