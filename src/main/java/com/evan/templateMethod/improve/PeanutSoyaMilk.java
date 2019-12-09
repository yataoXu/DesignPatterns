package com.evan.templateMethod.improve;

/**
 * @Description
 * @ClassName PeanutSoyaMilk
 * @Author Evan
 * @date 2019.12.09 22:50
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生");
    }
}