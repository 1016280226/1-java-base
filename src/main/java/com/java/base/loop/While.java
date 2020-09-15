package com.java.base.loop;

/**
 * @author Calvin
 * @titile: While 循环
 * @date 2019/2/27
 * @since 1.0
 * @format while(布尔表达式) { //循环内容 }
 * @mind  只要布尔表达式为 true，循环体会一直执行下去
 */
public class While {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int recordeTimes = 0;
        // 当 b 小于 10 时， 跳出循环
        while(a < b){ // 为true，继续循环， false 跳出循环
            b--;
            System.out.println("b:" + b);
            System.out.println(++ recordeTimes + "次数");
        }
    }
}
