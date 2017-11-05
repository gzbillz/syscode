package com.billz.util;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * 金额处理
 * @class NumberUtil.java
 * @author billz
 * @date 2017年10月13日
 */
public class NumberUtil {

	/**
     * 输入多个数字进行相乘
     * @param values
     * @return
     */
    public static Double multiply(Number... values) {
        BigDecimal result = new BigDecimal(1);
        for (Number v : values) {
            if(v==null){
                continue;
            }
            result = result.multiply(new BigDecimal(String.valueOf(v)), MathContext.DECIMAL32);
        }
        return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
