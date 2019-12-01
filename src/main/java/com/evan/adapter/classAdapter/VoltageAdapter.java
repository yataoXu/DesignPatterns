package com.evan.adapter.classAdapter;

/**
 * @Description
 * @ClassName VoltageAdapter
 * @Author Evan
 * @date 2019.12.01 14:19
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int des = 0;
        int ex = outPut220V() / 44;
        if (ex == 5) {
            des = ex;
            System.out.println("通过adapter处理后，输出电压为5V，可用");
        } else {
            System.out.println("通过adapter处理后，输出电压非5V，不可用");
        }
        return des;
    }
}
