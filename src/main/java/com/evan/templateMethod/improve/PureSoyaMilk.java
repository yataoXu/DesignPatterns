package com.evan.templateMethod.improve;

/**
 * @Description
 * @ClassName puraSoyaMilk
 * @Author Evan
 * @date 2019.12.09 22:51
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
