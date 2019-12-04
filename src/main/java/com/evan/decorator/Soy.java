package com.evan.decorator;

/**
 * @Description
 * @ClassName Soy
 * @Author Evan
 * @date 2019.12.02 23:18
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }

}

