package com.evan.decorator.other;

/**
 * @Description
 * @ClassName WaterComponent
 * @Author Evan
 * @date 2020.04.13 13:10
 */
public class WaterComponent implements DrinkComponent {

    @Override
    public void operation() {
        System.out.print("water drink");
    }

}