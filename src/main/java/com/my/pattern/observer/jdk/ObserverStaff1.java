package com.my.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 一号员工
 */
public class ObserverStaff1 implements Observer {

    private String heanMan;

    @Override
    public void update(Observable o, Object arg) {
        heanMan = (String) arg;
        System.out.println(this.getClass().getName()+"听说换领导了,是"+ heanMan);
    }
}
