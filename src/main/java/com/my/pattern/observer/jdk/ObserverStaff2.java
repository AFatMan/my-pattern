package com.my.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 二号员工
 */
public class ObserverStaff2 implements Observer {

    private String heanMan;

    @Override
    public void update(Observable o, Object arg) {
        heanMan = (String) arg;
        System.out.println(this.getClass().getName()+"是啊,就是"+ heanMan);
    }
}
