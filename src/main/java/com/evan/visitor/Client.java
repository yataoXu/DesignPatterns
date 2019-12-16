package com.evan.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("zhangsan"));
        objectStructure.attach(new Man("lisi"));
        objectStructure.attach(new Woman("cihua"));
        objectStructure.attach(new Woman("xiaohong"));

        Success success = new Success();
        objectStructure.display(success);




    }
}
