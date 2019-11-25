package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description 策略上下文
 * @ClassName StrategyContext
 * @Author Evan
 * @date 2019.11.24 20:48
 */
public class ConversionContext {
    private Conversion conversion;

    // 使用构造器注入具体的策略类
    public ConversionContext(Conversion conversion) {
        this.conversion = conversion;
    }

    public BigDecimal contextMethod(BigDecimal num) {
        // 调用策略实现的方法
       return conversion.CNYCurrencyConversion(num);
    }
}
