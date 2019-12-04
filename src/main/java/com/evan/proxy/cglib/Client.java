package com.evan.proxy.cglib;

public class Client {

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy(new TeacherDao());

        TeacherDao  teacherDao = (TeacherDao) proxy.getProxyInstance();

        // class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(teacherDao.getClass());
        
        teacherDao.teacher();


    }
}
