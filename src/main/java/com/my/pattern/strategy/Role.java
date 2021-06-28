package com.my.pattern.strategy;

/**
 * 这里有点像builder建造者模式
 */
public abstract class Role {
    protected String name;

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IRunBehavior runBehavior;

    protected IAttackBehavior attackBehavior;

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void defend(){
        defendBehavior.defend();
    }
    protected void display(){
        displayBehavior.display();
    }
    protected void run(){
        runBehavior.run();
    }
    protected void attack(){
        attackBehavior.attack();
    }
}
