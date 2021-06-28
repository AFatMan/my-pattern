package com.my.pattern.observer.custom;

public class ObserverUser2  implements Observer {

    private Subject subject;

    public ObserverUser2(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName()+":" +msg);
    }
}
