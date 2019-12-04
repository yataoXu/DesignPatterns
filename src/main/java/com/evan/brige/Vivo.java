package com.evan.brige;

/**
 * @Description
 * @ClassName Vivo
 * @Author Evan
 * @date 2019.12.02 21:27
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");

    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");

    }
}
