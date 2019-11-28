package com.evan.factory.factorymethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description
 * @ClassName OrderPizza
 * @Author Evan
 * @date 2019.11.28 21:58
 */
public abstract class OrderPizza {
    public abstract Pizza createPizza(String pizzaType);

    public OrderPizza() {
        Pizza pizza;
        do {
            String pizzaType = getType();
            pizza = createPizza(pizzaType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }


    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
