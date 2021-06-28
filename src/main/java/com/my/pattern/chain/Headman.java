package com.my.pattern.chain;

public class Headman extends AbstractHandler{
    @Override
    void handle(Staff staff) {
        if (staff.getRestDays()<5) {
            System.out.println("5天我可以处理,不用找部门经理");
        }else{
            System.out.println("我整不了,去找部门经理");
            nextHandler.handle(staff);
        }
    }
}
