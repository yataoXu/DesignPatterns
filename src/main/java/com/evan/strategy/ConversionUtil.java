package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName ConversionUtil
 * @Author Evan
 * @date 2019.11.24 20:43
 */
public class ConversionUtil {

    public static BigDecimal getResult(BigDecimal num1, BigDecimal num2){
        BigDecimal result = num1.multiply(num2).setScale(3, BigDecimal.ROUND_HALF_UP);
        return result;
    }
}
