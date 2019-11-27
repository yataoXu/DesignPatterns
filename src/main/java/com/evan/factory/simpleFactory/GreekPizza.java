package com.evan.factory.simpleFactory;

/**
 * @Description
 * @ClassName GreekPizza
 * @Author Evan
 * @date 2019.11.27 23:52
 */
public class GreekPizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("greek pizza prepare");
    }
}
