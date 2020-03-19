package com.evan.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

abstract class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行...");
        return map.values();
    }
}

public class Son extends Father {
    // 放大输入参数类型
    public Collection doSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }

}

class Test {

    public static void invoker() {
        // 父类存在的地方，子类就应该能够存在
        // Father f = new Father();
        Son son = new Son();
        HashMap map = new HashMap();
        son.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }

}
