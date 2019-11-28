package com.evan.factory.simpleFactory;

/**
 * @Description
 * @ClassName SimpleFactory2
 * @Author Evan
 * @date 2019.11.28 21:30
 */
public class SimpleFactory2 {

    // 根据pizzaType创建pizza
    public static Pizza createPizza(String pizzaType) {
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
