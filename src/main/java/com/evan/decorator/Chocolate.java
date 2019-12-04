package com.evan.decorator;

/**
 * @Description
 * @ClassName Chocolate
 * @Author Evan
 * @date 2019.12.02 23:15
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力 ");
        setPrice(3.0f); // 巧克力的价格
    }
}
