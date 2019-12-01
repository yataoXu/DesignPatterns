package com.evan.adapter.classAdapter;

/**
 * @Description
 * @ClassName Phone
 * @Author Evan
 * @date 2019.12.01 14:26
 */
public class Phone {

    public void charge(Voltage5V voltage5V) {
        System.out.println("手机充电方法");
        if (voltage5V.output5V() ==5){
            System.out.println("可用");
        }else{
            System.out.println("不可用");
        }
    }
}
