package com.evan.templateMethod;

/**
 * @Description
 * @ClassName RedBeanSoyaMilk
 * @Author Evan
 * @date 2019.12.09 22:46
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆");
    }
}
