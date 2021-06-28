package com.my.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

    private final Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before");
        return method.invoke(target,args);
    }

    public static void main(String[] args) {
        Coder target = new Coder();
        DynamicProxy dynamicProxy = new DynamicProxy(target);

        Worker worker = (Worker) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), dynamicProxy);
        worker.sleep();
        worker.work();
    }
}
