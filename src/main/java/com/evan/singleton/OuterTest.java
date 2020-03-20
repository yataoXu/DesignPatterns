package com.evan.singleton;

public class OuterTest {

    static {
        System.out.println("OutTest static class method");
    }

    static class InnerTest {
        static {
            System.out.println("InnerTest static class method");
        }
        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }

    public static void main(String[] args) {
       InnerTest.staticInnerMethod();

    }
}

//说明：
// 1. 加在一个类时，其内部类不会被同时加载。
// 2. 一个类被加载，当且仅当某个静态成员(静态域，构造器，静态方法等)被调用时发生。