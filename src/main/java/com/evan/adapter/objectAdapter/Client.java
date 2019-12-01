package com.evan.adapter.objectAdapter;

import com.evan.adapter.classAdapter.Phone;
import com.evan.adapter.classAdapter.Voltage220V;

/**
 * @Description
 * @ClassName Client
 * @Author Evan
 * @date 2019.12.01 18:17
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter2(new Voltage220V()));
    }
}
