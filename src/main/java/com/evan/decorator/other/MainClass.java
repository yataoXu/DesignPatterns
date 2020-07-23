package com.evan.decorator.other;

/**
 * @Description
 * @ClassName MainClass
 * @Author Evan
 * @date 2020.04.13 13:12
 */
public class MainClass {
    public static void main(String[] args) {
        WaterComponent water = new WaterComponent();
        // 往白开水里面加糖
        SugarDecorator sugar = new SugarDecorator(water);
        // 往加糖的白开水里面加茶叶
        TeaDecorator tea = new TeaDecorator(sugar);
        tea.operation();

    }
}
