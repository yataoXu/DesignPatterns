package com.evan.factory.simpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description
 * @ClassName OrderPizza2
 * @Author Evan
 * @date 2019.11.28 21:29
 */
public class OrderPizza2 {

    SimpleFactory simpleFactory;

    Pizza pizza;

    public OrderPizza2(){
        do {
            String pizzaType = getType();
            pizza = SimpleFactory2.createPizza(pizzaType);
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
