package com.evan.decorator;

import lombok.Data;

/**
 * @Description
 * @ClassName Drink
 * @Author Evan
 * @date 2019.12.02 22:58
 */
@Data
public abstract class Drink {

    // 描述
    public String des;
    // 价格
    private float price = 0.0f;

    // 总价
    public abstract float cost();
}
