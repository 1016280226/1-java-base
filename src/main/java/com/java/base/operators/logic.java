package com.java.base.operators;

/**
 * @author Calvin
 * @titile: 逻辑运算符
 * @date 2019/2/26
 * @since 1.0
 *
 * 当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，
 * 但是当得到第一个操作为false时，其结果就必定是false，
 * 这时候就不会再判断第二个操作了。
 */
public class logic {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;

        // && (并且) 当且仅当两个操作数都为真，条件才为真
        System.out.println(c > a && c > b); // 结果: true

        // || (或) 如果任何两个操作数任何一个为真，条件为真
        System.out.println(c > a || c > b); // 结果: true

        // ! 用来反转操作数的逻辑状态
        System.out.println(!(c > a || c > b)); // 结果: false
    }
}
