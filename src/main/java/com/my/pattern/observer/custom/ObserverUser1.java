package com.my.pattern.observer.custom;

public class ObserverUser1 implements Observer {

    private Subject subject;

    public ObserverUser1(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName() + ":" + msg);
    }
}
