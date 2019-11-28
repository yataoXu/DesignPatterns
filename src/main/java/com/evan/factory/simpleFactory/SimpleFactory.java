package com.evan.factory.simpleFactory;

/**
 * @Description
 * @ClassName SimpleFactory
 * @Author Evan
 * @date 2019.11.28 21:07
 */
public class SimpleFactory {


    // 根据pizzaType创建pizza
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }

        return pizza;
    }
}
