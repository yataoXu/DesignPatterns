package com.evan.inversion;

public class Client {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driver(new Benz());
        System.out.println("-----------");
        driver.driver(new WuLin());
    }
}
