package com.evan.decorator.other;

/**
 * @Description
 * @ClassName TeaDecorator
 * @Author Evan
 * @date 2020.04.13 13:11
 */
public class TeaDecorator extends DrinkDecorator{

    public TeaDecorator(DrinkComponent component) {
        super(component);
    }

    @Override
    public void operation()
    {
        component.operation();
        System.out.print(",with Tea");
    }
}