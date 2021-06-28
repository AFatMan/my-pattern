package com.my.pattern.visitor;

public interface ComputerPartVisitor {


    void visitor(Keyboard keyboard);
    void visitor(Mouse mouse);

    void visitor(Computer computer);

    void visitor(Monitor monitor);
}
