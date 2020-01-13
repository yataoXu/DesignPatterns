package com.evan.interpreter;

import java.util.HashMap;

/**
 * @Description
 * @ClassName AddExpression
 * @Author Evan
 * @date 2020.01.05 16:12
 */
public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
