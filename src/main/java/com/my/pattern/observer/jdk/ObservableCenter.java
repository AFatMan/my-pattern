package com.my.pattern.observer.jdk;

import java.util.Observable;

/**
 * 人事部负责通知
 */
public class ObservableCenter extends Observable {

    public void changeHeadMan(String msg){
        // 设置可更改Observer
        setChanged();
        /*
        不调用setChanged();则直接退出,不调用Observer的update方法
        if (!changed) return
         */
        notifyObservers(msg);
    }
}
