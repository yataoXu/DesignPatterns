package com.evan.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {

        // 创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        // 创建代理对象，同事将被代理的对象传递给代理对象

        ProxyTeacherDao proxy = new ProxyTeacherDao(teacherDao);

        // 通知代理对象，调用到被代理对象的方法
        // 即：执行的是代理对象的方法，代理对象再去调用被代理对象的方法
        proxy.teacher();

    }
}
