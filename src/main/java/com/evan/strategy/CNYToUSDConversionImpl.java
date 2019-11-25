package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName ConversionImpl
 * @Author Evan
 * @date 2019.11.24 20:38
 */
public class CNYToUSDConversionImpl implements Conversion {
    @Override
    public BigDecimal CNYCurrencyConversion(BigDecimal num) {
        BigDecimal result = ConversionUtil.getResult(num, new BigDecimal(0.1421));
        return result;
    }
}
