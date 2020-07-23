package com.evan.observer;


/**
 * @Description 抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，
 *              抽象主题提供一个接口，可以增加和删除观察者对象。
 * @ClassName Subject
 * @Author Evan
 * @date 2019.12.17 23:01
 */
public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void nodifyObserver();
}
