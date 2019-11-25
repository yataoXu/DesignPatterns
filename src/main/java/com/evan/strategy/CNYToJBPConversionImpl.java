package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName CNYToJBPConversionImpl
 * @Author Evan
 * @date 2019.11.24 21:04
 */
public class CNYToJBPConversionImpl implements Conversion {
    @Override
    public BigDecimal CNYCurrencyConversion(BigDecimal num) {
        BigDecimal result = ConversionUtil.getResult(num, new BigDecimal(0.1107));
        return result;
    }
}
