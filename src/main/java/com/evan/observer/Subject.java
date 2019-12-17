package com.evan.observer;


/**
 * @Description
 * @ClassName Subject
 * @Author Evan
 * @date 2019.12.17 23:01
 */
public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void nodifyObserver();
}
