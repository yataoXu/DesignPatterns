package com.evan.decorator.other;

/**
 * @Description
 * @ClassName SugarDecorator
 * @Author Evan
 * @date 2020.04.13 13:11
 */
public class SugarDecorator extends DrinkDecorator{

    public SugarDecorator(DrinkComponent component) {
        super(component);
    }
    public void operation()
    {
        component.operation();
        System.out.print(",with sugar");
    }
}