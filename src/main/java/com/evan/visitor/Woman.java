package com.evan.visitor;



//1. 这里使用了双分派，即先在客户端程序中，将具体的状态作为参数传递Woman中（第一次分派）
//2. 然后woman类调用作为参数的具体方法中方法getwomanResult,同时将自己（this）作为参数传入。完成第二次的分派
public class Woman  extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
