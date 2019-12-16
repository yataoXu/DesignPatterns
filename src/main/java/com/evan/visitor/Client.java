package com.evan.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);




    }
}
