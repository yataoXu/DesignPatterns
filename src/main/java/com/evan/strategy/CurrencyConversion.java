package com.evan.strategy;

import java.math.BigDecimal;


/**
 * @Description
 * @ClassName BaiduNetDisk
 * @Author Evan
 * @date 2019.11.24 19:25
 */
public class CurrencyConversion {

    public BigDecimal CNYCurrencyConversion(BigDecimal num, String moneyType) {

        BigDecimal result = new BigDecimal(0);
        // 人民币转美元
        if ("CNYToUSD".equalsIgnoreCase(moneyType)) {

            result = num.multiply(new BigDecimal(0.1421)).setScale(3, BigDecimal.ROUND_HALF_UP);

            // 人民币转日元
        } else if ("CNYToJPY".equalsIgnoreCase(moneyType)) {
            result = num.multiply(new BigDecimal(15.4342));
            // 人民币转欧元
        } else if ("CNYToEUR".equalsIgnoreCase(moneyType)) {
            result = num.multiply(new BigDecimal(0.1289));
        }
        return result;
    }
}
