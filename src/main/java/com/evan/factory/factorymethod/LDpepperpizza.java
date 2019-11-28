package com.evan.factory.factorymethod;

/**
 * @Description
 * @ClassName LDpepperpizza
 * @Author Evan
 * @date 2019.11.28 21:57
 */
public class LDpepperpizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ld pepper pizza 材料准备");
    }
}
