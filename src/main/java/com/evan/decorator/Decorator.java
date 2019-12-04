package com.evan.decorator;

/**
 * @Description
 * @ClassName Decorator
 * @Author Evan
 * @date 2019.12.02 23:09
 */
public class Decorator extends Drink {
    // 被装饰者
    private Drink obj;

    public Decorator(Drink obj) { // 组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes()
        return des + " " + getPrice() + " && " + obj.getDes();
    }


}
