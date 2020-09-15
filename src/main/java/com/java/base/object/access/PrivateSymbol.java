package com.java.base.object.access;

/**
 * @author Calvin
 * @titile: 私有访问控制符
 * @date 2019/2/21
 * @since 1.0
 */
public class PrivateSymbol {

    /**
     * private 修饰的成员变量，只能适用于当前类
     */
    private String s;

    /**
     * pirvate 修饰的方法，只能适用于当前类
     * @param s
     * @return
     */
    private void println(String s){
        System.out.println(s);
    };
}

class AccessPrivateSymblol{

    public static void main(String[] args) {
        PrivateSymbol privateSymbol = new PrivateSymbol();
        // 异常信息 prntln(java.lang.String)' has private access in 'note4.access.PrivateSymbol
        //  privateSymbol.println("Private");
    }
}
