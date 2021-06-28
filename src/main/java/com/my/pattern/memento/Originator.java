package com.my.pattern.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(state);
    }

    public String getStateFromMemento(Memento memento){
        return  memento.getState();
    }
}
