package com.evan.proxy.dynamicproxy;


import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        // 创建目标对象
        ITeacherDao target = new TeacherDao();
        MyTransaction myTransaction = new MyTransaction();
        DynamicProxy proxy = new DynamicProxy(target,myTransaction);



        // 通过代理对象，调用目标对象的方法
        ITeacherDao teacherDao = (ITeacherDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxy);
        // class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(teacherDao.getClass());
        teacherDao.teacher();
    }
}
