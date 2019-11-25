package com.evan.strategy;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName Client
 * @Author Evan
 * @date 2019.11.24 20:55
 */
public class Client {
    public static void main(String[] args) {
        //1.创建人民转换美元策略
        CNYToUSDConversionImpl  CNYToUSDConversion = new CNYToUSDConversionImpl();
        // 2.创建转换上下文对象，并设置具体的报价策略
        ConversionContext conversionContext = new ConversionContext(CNYToUSDConversion);
        //3.调用转换上下文的方法
        BigDecimal result = conversionContext.contextMethod(new BigDecimal(100));
        System.out.println(result);
    }
}
