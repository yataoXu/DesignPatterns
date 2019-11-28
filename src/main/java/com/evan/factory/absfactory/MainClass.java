package com.evan.factory.absfactory;

/**
 * @Description
 * @ClassName MainClass
 * @Author Evan
 * @date 2019.11.28 22:10
 */
public class MainClass {

    public static void main(String[] args) {
        new OrderPizza(new BJPizzaFactory());
    }
}
