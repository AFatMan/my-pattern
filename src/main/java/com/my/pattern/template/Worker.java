package com.my.pattern.template;

/**
 * 打工人
 */
public abstract class Worker {

    void start(){
        System.out.println("上班打卡");
    }
    void end(){
        System.out.println("下班打卡");
    }

    void onComputer(){
        System.out.println("开机");
    }
    void offComputer(){
        System.out.println("关机");
    }

    abstract void work();

    void dayWork(){
        start();
        onComputer();
        work();
        offComputer();
        end();
    }

}
