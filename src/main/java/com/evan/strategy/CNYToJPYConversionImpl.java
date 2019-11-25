package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName CNYToJPYConversionImpl
 * @Author Evan
 * @date 2019.11.24 20:45
 */
public class CNYToJPYConversionImpl implements Conversion {
    @Override
    public BigDecimal CNYCurrencyConversion(BigDecimal num) {
        BigDecimal result = ConversionUtil.getResult(num, new BigDecimal(15.4342));
        return result;
    }
}
