package com.evan.interpreter;
import	java.util.HashMap;

/**
 * @Description
 * @ClassName AbstractExpression
 * @Author Evan
 * @date 2020.01.05 16:03
 */
public abstract class Expression  {

    public abstract int interpreter(HashMap<String,Integer> var);

}
