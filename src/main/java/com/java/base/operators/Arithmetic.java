package com.java.base.operators;

import java.math.BigDecimal;

/**
 * @author Calvin
 * @titile: 算术运算符
 * @date 2019/2/25
 * @since 1.0
 */
public class Arithmetic {

    public static void main(String[] args) {
        // int 类型
        int a = 10;
        int b = 11;
        System.out.println("int type arithmetic");
        System.out.println(a + b); // 加法
        System.out.println(a - b); // 减法
        System.out.println(a * b); // 乘法
        System.out.println(a / b); // 除法
        System.out.println(a % b); // 取模
        System.out.println(a ++);  // 自增 （后加）
        System.out.println(++ a);  // 自增 （先加）
        System.out.println(a --);  // 自减 （后减）
        System.out.println(-- a);  // 自减  （先减）


        // double 类型
        double c = 10;
        double d = 11;
        System.out.println("\ndouble type arithmetic");
        System.out.println(c + d); // 加法
        System.out.println(c - d); // 减法
        System.out.println(c * d); // 乘法
        System.out.println(c / d); // 除法
        System.out.println(c % d); // 取模
        System.out.println(c ++);  // 自增 （后加）
        System.out.println(++ c);  // 自增 （先加）
        System.out.println(c --);  // 自减 （后减）
        System.out.println(-- c);  // 自减  （先减）


        // BigDemical 类型
        BigDecimal e = new BigDecimal(12);
        BigDecimal f = new BigDecimal(13);
        System.out.println("\nBigDemiacl type arithmetic");
        System.out.println(e.add(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 加法
        System.out.println(e.subtract(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 减法
        System.out.println(e.multiply(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 乘法
        System.out.println(e.divide(f).setScale(2,BigDecimal.ROUND_HALF_DOWN)); // 除法
        System.out.println(e.abs()); // 绝对值
    }
}
