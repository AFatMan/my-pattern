package com.my.pattern.memento;

import java.util.LinkedList;

public class CareTaker {

    public LinkedList<Memento> mementos = new LinkedList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento getCurrent(){
        // return mementos.peek();
        return mementos.peekLast();
    }

}
