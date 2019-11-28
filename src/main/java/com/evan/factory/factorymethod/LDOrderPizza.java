package com.evan.factory.factorymethod;

/**
 * @Description
 * @ClassName LDOrderPizza
 * @Author Evan
 * @date 2019.11.28 22:00
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("ldcheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("ldcheese");
        } else if (pizzaType.equals("ldpepper")) {
            pizza = new LDpepperpizza();
            pizza.setName("ldpepper");
        }
        return pizza;
    }
}
