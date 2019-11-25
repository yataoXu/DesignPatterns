//package com.evan.segregation;
//
///**
// * @Description
// * @ClassName Segregation1
// * @Author Evan
// * @date 2019.11.25 22:56
// */
//public class Segregation1 {
//
//    public static void main(String[] args) {
//
//        A a = new A();
//        a.dependency1(new B());
//        a.dependency2(new B());
//        a.dependency3(new B());
//        C c = new C();
//        c.dependency1(new D());
//        c.dependency4(new D());
//        c.dependency5(new D());
//
//    }
//
//}
//
//interface Interface1 {
//    void operation1();
//
//    void operation2();
//
//    void operation3();
//
//    void operation4();
//
//    void operation5();
//}
//
//class B implements Interface1 {
//    @Override
//    public void operation1() {
//        System.out.println("B 实现了 operation1");
//    }
//
//    @Override
//    public void operation2() {
//        System.out.println("B 实现了 operation2");
//    }
//
//    @Override
//    public void operation3() {
//        System.out.println("B 实现了 operation3");
//    }
//
//    @Override
//    public void operation4() {
//        System.out.println("B 实现了 operation4");
//    }
//
//    @Override
//    public void operation5() {
//        System.out.println("B 实现了 operation5");
//    }
//}
//
//
//class D implements Interface1 {
//    @Override
//    public void operation1() {
//        System.out.println("D 实现了 operation1");
//    }
//
//    @Override
//    public void operation2() {
//        System.out.println("D 实现了 operation2");
//    }
//
//    @Override
//    public void operation3() {
//        System.out.println("D 实现了 operation3");
//    }
//
//    @Override
//    public void operation4() {
//        System.out.println("D 实现了 operation4");
//    }
//
//    @Override
//    public void operation5() {
//        System.out.println("D 实现了 operation5");
//    }
//}
//
//class A {
//    public void dependency1(Interface1 i) {
//        i.operation1();
//    }
//
//    public void dependency2(Interface1 i) {
//        i.operation2();
//    }
//
//    public void dependency3(Interface1 i) {
//        i.operation3();
//    }
//}
//
//
//class C {
//    public void dependency1(Interface1 i) {
//        i.operation1();
//    }
//
//    public void dependency4(Interface1 i) {
//        i.operation4();
//    }
//
//    public void dependency5(Interface1 i) {
//        i.operation5();
//    }
//}