package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName BaiduNetDiskMain
 * @Author Evan
 * @date 2019.11.24 19:29
 */
public class CurrencyConversionMain {
    public static void main(String[] args) {

        String CNYToUSD = "CNYToUSD";
        CurrencyConversion b = new CurrencyConversion();
        BigDecimal bigDecimal = b.CNYCurrencyConversion(BigDecimal.ONE, CNYToUSD);
        System.out.println(bigDecimal.toString());
    }
}
