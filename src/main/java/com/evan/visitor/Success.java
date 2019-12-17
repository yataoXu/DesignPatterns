package com.evan.visitor;

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + "男士给的评价是成功");

    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + "女士给的评价是成功");
    }
}
