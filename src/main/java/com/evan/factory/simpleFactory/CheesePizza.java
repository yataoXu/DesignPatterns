package com.evan.factory.simpleFactory;

/**
 * @Description 奶酪披萨
 * @ClassName CheesePizza
 * @Author Evan
 * @date 2019.11.27 23:50
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("奶酪 prepare ");

    }

}
