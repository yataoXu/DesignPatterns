package com.evan.observer;

/**
 * @Description 具体观察者
 * @ClassName Sina
 * @Author Evan
 * @date 2019.12.17 23:05
 */
public class SinaSite implements Observer {

    private float temperature;
    private float preference;
    private float humidity;

    // 更新天气情况，是由WeatherData来调用，
    @Override
    public void update(float temperature, float preference, float humidity) {
        this.temperature = temperature;
        this.preference = preference;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("=========sina网站===========");
        System.out.println("=========sina网站气温"+this.temperature+"===========");
        System.out.println("=========sina网站气压"+this.preference+"===========");
        System.out.println("=========sina网站湿度"+this.humidity+"===========");
    }
}
