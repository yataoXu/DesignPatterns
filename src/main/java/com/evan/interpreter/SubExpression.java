package com.evan.interpreter;

import java.util.HashMap;

/**
 * @Description
 * @ClassName SubExpression
 * @Author Evan
 * @date 2020.01.05 16:13
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
