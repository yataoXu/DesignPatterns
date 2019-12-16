package com.evan.visitor;

public abstract class Person {

    // 提供一个方法让访问者可以访问
    public abstract void accept(Action action);
}
