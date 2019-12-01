package com.evan.adapter.classAdapter;

/**
 * @Description
 * @ClassName Client
 * @Author Evan
 * @date 2019.12.01 14:30
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
