package com.evan.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    // 维护一个集合
    private List<Person> personList = new LinkedList<>();


    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person p){
        personList.remove(p);
    }

    // 显示显示结果
    public void display(Action action){
        for (Person person : personList){
            person.accept(action);
        }
    }

}
