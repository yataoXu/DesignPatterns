package com.evan.inversion;

/**
 * @Description
 * @ClassName IRecever
 * @Author Evan
 * @date 2019.11.25 23:37
 */

public class DependecyInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new Wechat());
    }
}

 interface IRecever {
    String getInfo();
}

class Email implements IRecever{
    public String getInfo() {
        return "电子邮件: hello world";
    }
}

class Wechat implements IRecever{
    public String getInfo() {
        return "Wechat: hello world";
    }
}
// 完成Person接收消息的功能
class Person {
    public void receive(IRecever receiver) {
        System.out.println(receiver.getInfo());
    }
}
