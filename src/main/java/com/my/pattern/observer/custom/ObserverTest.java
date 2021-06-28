package com.my.pattern.observer.custom;

/**
 * 
 */
public class ObserverTest {

    public static void main(String[] args) {
        ObjectFor3D objectFor3D = new ObjectFor3D();
        ObserverUser1 observerUser1 = new ObserverUser1(objectFor3D);
        ObserverUser2 observerUser2 = new ObserverUser2(objectFor3D);

        objectFor3D.setMsg("889666");
    }
}
