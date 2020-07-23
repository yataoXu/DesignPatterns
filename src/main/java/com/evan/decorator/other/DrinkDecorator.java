package com.evan.decorator.other;

/**
 * @Description
 * @ClassName DrinkDecorator
 * @Author Evan
 * @date 2020.04.13 13:10
 */
public class DrinkDecorator implements DrinkComponent {

    DrinkComponent component;

    public DrinkDecorator(DrinkComponent component) {
        super();
        this.component = component;
    }

    @Override
    public void operation() {

    }
}
