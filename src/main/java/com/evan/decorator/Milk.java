package com.evan.decorator;

/**
 * @Description
 * @ClassName Milk
 * @Author Evan
 * @date 2019.12.02 23:17
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶 ");
        setPrice(3.0f); // 牛奶的价格
    }
}
