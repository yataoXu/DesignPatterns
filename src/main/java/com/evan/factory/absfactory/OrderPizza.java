package com.evan.factory.absfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description
 * @ClassName OrderPizza
 * @Author Evan
 * @date 2019.11.28 21:58
 */
public class OrderPizza {


    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
      setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza;
        this.factory = factory;
        do {
            String pizzaType = getType();
            pizza = factory.createPizza(pizzaType);
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
