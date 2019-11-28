package com.evan.factory.absfactory;

/**
 * @Description
 * @ClassName BJCheesePizza
 * @Author Evan
 * @date 2019.11.28 21:52
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京奶酪pizza 材料准备");
    }
}
