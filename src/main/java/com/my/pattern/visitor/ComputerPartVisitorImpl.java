package com.my.pattern.visitor;

public class ComputerPartVisitorImpl implements ComputerPartVisitor{

    @Override
    public void visitor(Keyboard keyboard) {
        System.out.println(keyboard);

    }

    @Override
    public void visitor(Mouse mouse) {
        System.out.println(mouse);

    }

    @Override
    public void visitor(Computer computer) {
        System.out.println(computer);

    }

    @Override
    public void visitor(Monitor monitor) {
        System.out.println(monitor);

    }
}
