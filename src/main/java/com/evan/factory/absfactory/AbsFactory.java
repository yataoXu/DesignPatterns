package com.evan.factory.absfactory;

/**
 * @Description
 * @ClassName AbsFactory
 * @Author Evan
 * @date 2019.11.28 22:38
 */
public interface AbsFactory {
    public abstract Pizza createPizza(String pizzaType);
}
