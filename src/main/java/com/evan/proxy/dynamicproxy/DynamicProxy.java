package com.evan.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

    // 维护一个目标对象
    private Object target;
    //增强类
    private MyTransaction myTransaction;
    //构造函数注入目标类和增强类
    public DynamicProxy(Object target,MyTransaction myTransaction){
        this.target = target;
        this.myTransaction = myTransaction;
    }


    //代理类的每一个方法被调用的时候都会调用下边的这个invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始了");
        this.myTransaction.beginTransaction();
        Object returnValue = method.invoke(target, args);
        this.myTransaction.commit();
        System.out.println("动态代理结束啦");
        return returnValue;
    }
}
