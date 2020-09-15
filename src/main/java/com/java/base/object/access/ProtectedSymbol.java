package com.java.base.object.access;

/**
 * @author Calvin
 * @titile: 受保护访问控制符
 * @date 2019/2/21
 * @since 1.0
 */
public class ProtectedSymbol {

    protected String message= "PROTECTED_ACCESS_CONTROLLER_SYMBOL";

    protected void println(String message){
        System.out.println(message);
    }
}

/**
 * 在同一个包下访问 protected
 */
class AccessProtectdBySamePackage{

    public static void main(String[] args) {
        /**
         * protected -> 可以被同一个包中的类访问
         */
        ProtectedSymbol protectedSymbol = new ProtectedSymbol();
        protectedSymbol.println(protectedSymbol.message);
    }
}

/**
 * 通过子类访问父类 protected
 */
class AccessProtectdByMyChild extends ProtectedSymbol {

    public static void main(String[] args) {
        /**
         * protected -> 可以通过子类访问父类
         */
        ProtectedSymbol protectedSymbol = new ProtectedSymbol();
        protectedSymbol.println(protectedSymbol.message);
    }
}