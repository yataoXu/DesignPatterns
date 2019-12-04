package com.evan.proxy.staticproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teacher() {
        System.out.println("这个是目标方法，被代理的方法");
    }
}
