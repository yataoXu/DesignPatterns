package com.evan.factory.simpleFactory;

import java.io.BufferedReader;

import java.io.InputStreamReader;

/**
 * @Description
 * @ClassName OrderPizza
 * @Author Evan
 * @date 2019.11.27 23:59
 */
public class OrderPizza {


    SimpleFactory simpleFactory;

    Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;

        do {
            String pizzaType = getType();
            pizza = this.simpleFactory.createPizza(pizzaType);

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