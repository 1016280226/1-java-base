package com.java.base.object.access;

/**
 * @author Calvin
 * @titile: 默认访问控制控制符
 * @date 2019/2/21
 * @since 1.0
 */
public class DefaultSymbol {

    String message= "DEFAULT_ACCESS_CONTROLLER_SYMBOL";

    void println(String message){
        System.out.println(message);
    }
}

/**
 * 在同一个包下访问 Default
 */
class AccessDefaultBySamePackage{

    public static void main(String[] args) {
        /**
         * default -> 可以被同一个包中的类访问
         */
        DefaultSymbol defaultSymbol = new DefaultSymbol();
        defaultSymbol.println(defaultSymbol.message);
    }
}

/**
 * 通过子类访问父类 default
 */
class AccessDefaultByMyChild extends DefaultSymbol {

    public static void main(String[] args) {
        /**
         * Default -> 可以通过子类访问父类
         */
        DefaultSymbol defaultSymbol = new DefaultSymbol();
        defaultSymbol.println(defaultSymbol.message);
    }
}

// 在不同包访问Default -> 异常报错信息 message' is not public in 'note4.access.DefaultSymbol'. Cannot be accessed from outside package