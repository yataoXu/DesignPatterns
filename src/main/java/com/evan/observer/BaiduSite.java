package com.evan.observer;

/**
 * @Description
 * @ClassName Baidu
 * @Author Evan
 * @date 2019.12.17 23:04
 */
public class BaiduSite implements Observer {
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
        System.out.println("=========百度网站===========");
        System.out.println("=========百度网站气温"+this.temperature+"===========");
        System.out.println("=========百度网站气压"+this.preference+"===========");
        System.out.println("=========百度网站湿度"+this.humidity+"===========");
    }
}
