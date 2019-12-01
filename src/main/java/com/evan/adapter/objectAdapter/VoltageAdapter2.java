package com.evan.adapter.objectAdapter;

import com.evan.adapter.classAdapter.Voltage220V;
import com.evan.adapter.classAdapter.Voltage5V;

/**
 * @Description
 * @ClassName VoltageAdapter2
 * @Author Evan
 * @date 2019.12.01 18:11
 */
public class VoltageAdapter2 implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dest = 0;
        if (voltage220V != null) {
            System.out.println("使用对象适配器，进行操作");
            dest = voltage220V.outPut220V() / 44;
            System.out.println("进行转换后的电压: " + dest);
        }
        return dest;

    }
}
