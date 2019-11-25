//package com.evan.inversion;
//
//import java.util.Properties;
//
///**
// * @Description
// * @ClassName DependecyInversion1
// * @Author Evan
// * @date 2019.11.25 23:25
// */
//public class DependecyInversion1 {
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.receive(new Email());
//    }
//}
//
//class Email {
//    public String getInfo() {
//        return "电子邮件: hello world";
//    }
//}
//// 完成Person接收消息的功能
//
//class Person {
//    public void receive(Email email) {
//        System.out.println(email.getInfo());
//    }
//}
