package com.my.pattern.facade;

public class Player {
    public void on() {
        System.out.println("打开播放器");
    }

    public void make3DListener() {
        System.out.println("设置声音为3d环绕");
    }

    public void off() {
        System.out.println("关闭播放器");
    }
}
