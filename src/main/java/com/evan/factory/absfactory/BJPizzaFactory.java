package com.evan.factory.absfactory;


/**
 * @Description
 * @ClassName BJOrderPizza
 * @Author Evan
 * @date 2019.11.28 21:59
 */
public class BJPizzaFactory implements AbsFactory{


    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("bjcheese");
        } else if (pizzaType.equals("pepper")) {
            pizza = new BJpepperPizza();
            pizza.setName("bjpepper");
        }
        return pizza;
    }
}
