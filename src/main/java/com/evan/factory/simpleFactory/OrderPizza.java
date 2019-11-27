package com.evan.factory.simpleFactory;

/**
 * @Description
 * @ClassName OrderPizza
 * @Author Evan
 * @date 2019.11.27 23:59
 */
public class OrderPizza {

    public void orderpizza(String pizzaType) {

        Pizza pizza = null;

        do {
            if (pizzaType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek");
                if (pizzaType.equals("cheese")) {
                    pizza = new CheesePizza();
                    pizza.setName("cheese");
                } else {
                    return;
                }
            }
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
}