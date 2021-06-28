package com.my.pattern.facade;

/**
 * 外观模式
 * 一般用于需要简化一个很大的接口，或者一群复杂的接口的时候。
 *
 * 不就是一个方法给你做完全部而已嘛,一键开启一键关闭,这也能叫个模式?
 */
public class FacadeTest {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Computer(),new Player(),new Light(),new Projector(),new PopcornPopper());
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.stopMovie();
    }
}
