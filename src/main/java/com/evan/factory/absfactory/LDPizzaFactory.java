package com.evan.factory.absfactory;

/**
 * @Description
 * @ClassName LDOrderPizza
 * @Author Evan
 * @date 2019.11.28 22:00
 */
public class LDPizzaFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("ldcheese");
        } else if (pizzaType.equals("pepper")) {
            pizza = new LDpepperpizza();
            pizza.setName("ldpepper");
        }
        return pizza;
    }

}


