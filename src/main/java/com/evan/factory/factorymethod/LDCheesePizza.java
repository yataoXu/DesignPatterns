package com.evan.factory.factorymethod;

import java.nio.channels.Pipe;

/**
 * @Description
 * @ClassName LDCheesePizza
 * @Author Evan
 * @date 2019.11.28 21:53
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ld奶酪pizza 材料准备");
    }
}
