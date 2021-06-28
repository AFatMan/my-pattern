package com.my.pattern.visitor;

public class Computer implements ComputerPart{

    ComputerPart[] computerParts = new ComputerPart[]{new Keyboard(),new Mouse(),new Monitor()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        for (ComputerPart computerPart : computerParts) {

            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visitor(this);
    }
}
