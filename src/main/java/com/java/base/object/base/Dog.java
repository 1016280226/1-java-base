package com.java.base.object.base;

/**
 * @author Calvin
 * @titile: Final
 * @date 2019/2/20
 * @since 1.0
 */


/**
 * final -> 修饰 类
 */
public final class Dog extends Animal {

    // 修饰 变量
    final String SEX = "MALE";

    // 修饰 方法
    @Override
    public final String behavious() {
        // Systime.out.println  -> static 类名直接调用
        System.out.println("狗会叫");
        return "Dog can wang wang ";
    }
}
