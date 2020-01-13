package com.evan.interpreter;


import java.util.HashMap;

/**
 * @Description
 * @ClassName SymbolExpression
 * @Author Evan
 * @date 2020.01.05 16:07
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
