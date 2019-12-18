package com.evan.observer;

public class Client {

    public static void main(String[] args) {

        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        BaiduSite baiduSite = new BaiduSite();
        SinaSite sinaSite = new SinaSite();

        // 注册到weatherData
        weatherData.register(baiduSite);
        weatherData.register(sinaSite);


        // 测试
        System.out.println("通知注册的各个观察者");
        weatherData.setData(10f, 100f, 30.3f);


        // 注销掉sina
        weatherData.remove(sinaSite);

        // 测试
        System.out.println("通知各个注册的观察者");
        weatherData.setData(20f, 10f, 10f);


    }
}
