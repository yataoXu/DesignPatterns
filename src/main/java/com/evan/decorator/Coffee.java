package com.evan.decorator;

/**
 * @Description
 * @ClassName Caffee
 * @Author Evan
 * @date 2019.12.02 22:58
 */
public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
