package com.evan.visitor;

public class Man extends Person {

    private String name;

    public Man(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
