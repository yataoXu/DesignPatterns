package com.evan.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {


    // 维护一个目标对象
    private Object target;


    public CglibProxy(Object target) {
        this.target = target;
    }


    // 返回一个代理对象，是target对象的代理对象
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置返回函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }


    //重写intercept 方法，这个方法会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("CGlib代理开始了");
        Object returnValue = method.invoke(target, args);
        System.out.println("CGlib代理结束啦");
        return returnValue;
    }
}
