package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName CNYToEURConversionImpl
 * @Author Evan
 * @date 2019.11.24 20:47
 */
public class CNYToEURConversionImpl implements Conversion {
    @Override
    public BigDecimal CNYCurrencyConversion(BigDecimal num) {
        BigDecimal result = ConversionUtil.getResult(num, new BigDecimal(0.1289));
        return result;
    }
}
