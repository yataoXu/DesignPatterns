package com.evan.interpreter;

import java.util.HashMap;

/**
 * @Description
 * @ClassName VarExpression
 * @Author Evan
 * @date 2020.01.05 16:07
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
