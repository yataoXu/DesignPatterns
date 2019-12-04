package com.evan.brige;

/**
 * @Description
 * @ClassName XiaoMi
 * @Author Evan
 * @date 2019.12.02 21:26
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");

    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");

    }
}
