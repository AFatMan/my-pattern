package com.my.pattern.chain;

public class DepartmentManager extends AbstractHandler {

    @Override
    void handle(Staff staff) {
        if (staff.getRestDays() <= 10 && staff.getRestDays() > 5) {
            System.out.println("5-10天我可以处理,不用找人事了");
        } else {
            System.out.println("我整不了,去找人事");
            nextHandler.handle(staff);
        }
    }
}
