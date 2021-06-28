package com.my.pattern.observer.jdk;


/**
 * 使用jdk自带观察者模式
 *
 * @see java.util.Observer
 * @see java.util.Observable
 *
 * 其实也就是,Observable的实现类,执行notifyObservers,通知属性Vector<Observer> obs,调用Observer的update方法
 */
public class ObserverTest {

    public static void main(String[] args) {
        ObservableCenter observableCenter = new ObservableCenter();
        ObserverStaff1 observerStaff1 = new ObserverStaff1();
        ObserverStaff2 observerStaff2 = new ObserverStaff2();

        // 人事部需要通知员工1,员工2
        observableCenter.addObserver(observerStaff1);
        observableCenter.addObserver(observerStaff2);
        // 通知内容,换领导了
        observableCenter.changeHeadMan("马云");
    }

}
