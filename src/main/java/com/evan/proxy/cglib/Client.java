package com.evan.proxy.cglib;

public class Client {

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy(new TeacherDao());

        TeacherDao  teacherDao = (TeacherDao) proxy.getProxyInstance();

        // class com.evan.proxy.cglib.TeacherDao$$EnhancerByCGLIB$$e7e75d26
        System.out.println(teacherDao.getClass());
        
        teacherDao.teacher();


    }
}
