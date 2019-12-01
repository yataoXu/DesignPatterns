package com.evan.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @ClassName Sheep
 * @Author Evan
 * @date 2019.11.30 01:10
 */
@Data
@AllArgsConstructor
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend; //是对象, 克隆是会如何处理

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
