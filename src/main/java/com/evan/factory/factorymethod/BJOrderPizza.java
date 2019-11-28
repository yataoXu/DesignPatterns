package com.evan.factory.factorymethod;


/**
 * @Description
 * @ClassName BJOrderPizza
 * @Author Evan
 * @date 2019.11.28 21:59
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("bjcheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("bjcheese");
        } else if (pizzaType.equals("bjpepper")) {
            pizza = new BJpepperPizza();
            pizza.setName("bjpepper");
        }
        return pizza;
    }
}
