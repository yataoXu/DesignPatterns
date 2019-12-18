package com.evan.observer;

import java.util.ArrayList;

/**
 * @Description 观察者的核心类
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用arrayList管理
 * 3. 当数据有更新时，就主动的调用arrayList,通知所有的订阅者
 * @ClassName WeatherData
 * @Author Evan
 * @date 2019.12.17 23:03
 */
public class WeatherData implements Subject {

    private float temperature;
    private float preference;
    private float humidity;

    // 观察者集合
    private ArrayList<Observer> observers;


    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    public void dataChange() {
        // 调用 接入方update
        nodifyObserver();
    }

    // 当数据更新的时候调用setData
    public void setData(float temperature, float preference, float humidity) {
        this.temperature = temperature;
        this.preference = preference;
        this.humidity = humidity;
        // 调用dataChange 将数据信息推送给接入方
        dataChange();

    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }


    // 遍历所有的观察者，并 通知
    @Override
    public void nodifyObserver() {

        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.preference, this.humidity);
        }
    }
}
