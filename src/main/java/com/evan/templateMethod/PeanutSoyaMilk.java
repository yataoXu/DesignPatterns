package com.evan.templateMethod;

import com.evan.decorator.Soy;

/**
 * @Description
 * @ClassName PeanutSoyaMilk
 * @Author Evan
 * @date 2019.12.09 22:47
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生");
    }
}
