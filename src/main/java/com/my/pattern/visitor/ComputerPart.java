package com.my.pattern.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
