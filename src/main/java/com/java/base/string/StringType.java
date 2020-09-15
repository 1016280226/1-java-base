package com.java.base.string;


public class StringType {

    public static void test1() {
        // 实例化1: 通过赋值
        java.lang.String str1 = "1";
        // 实例化2: 通过构造方法
        java.lang.String str2 = new java.lang.String("1");
        java.lang.String str3 = str1;
        java.lang.String str4 = "1";

        /**
         * String 内容比较
         * 结论:
         *  a.每个 String 对象的内容都是保存在堆内存中，但是str1 和 str2 分别保存的在不同的内存空间中，
         *    虽然，内存值相同，但是内存地址不同，因为str2 使用了new()开辟了内存空间，所以返回的结果为false
         *  b.而str3 引用的是 str1 内存地址，所以同一个地址内存空间和值，所以返回为true.
         *  c.== 号用来数值和地址值进行比较，所以字符串比较进行equals() 方法进行比较。
         *  d.一个字符串就是一个String类的匿名对象，匿名对象就是已经开辟堆内存空间的并可以直接使用的对象，
         *    所以str1 和 str4 指向的是同一个内存地址和值已经在堆内存已经开辟好。
         */
        System.out.println("运行结果: str1 和 str2 比计较后，返回 " + compare(str1, str2));
        System.out.println("运行结果: str1 和 str3 比计较后，返回 " + compare(str1, str3));
        System.out.println("运行结果: str1 和 str4 比计较后，返回 " + equals(str1, str4));

        System.out.println("运行结果: str1 和 str2 比计较后，返回 " + equals(str1, str2));
        System.out.println("运行结果: str1 和 str3 比计较后，返回 " + equals(str1, str3));
    }

    /**
     * String
     * 结论:
     * 1.声明变量后，内容不可改变。
     * 因为使用的是String 类是以final 关键字定义的，所以str 对象的值是不可改变的。
     * 2.从以下程序中的运行过程str 内容的改变是通过内存地址的"断开-连接"变化完成的。（实际就是str 指向的地址内存发生了改变）
     * 栈内存   堆内存
     * str   -> hello
     * -> world 开辟了新的内存
     * -> str + world
     */
    public static void test2() {
        String str = "hello";
        str += " world";
        System.out.println(str);
    }

    /**
     * String 常用的方法
     */
    public static void test3() {

    }

    /**
     * 字符串转换成字符数组
     *
     * @param str
     * @return
     */
    private static char[] StringToCharArray(String str) {
        return str.toCharArray();
    }

    /**
     * 字符数组转换成字符串
     *
     * @param chars
     * @return
     */
    private static String charArrayToString(char[] chars) {
        return new String(chars);
    }

    /**
     * 
     * @param str
     * @param index
     * @return
     */
    private static char chartAt(String str, int index){
        return str.charAt(index);
    }

    private static Boolean compare(java.lang.String str1, java.lang.String str2) {
        /**
         * == 号用来数值和地址值进行比较，所以字符串比较进行equals() 方法进行比较。
         */
        return str1 == str2;
    }

    private static Boolean equals(java.lang.String str1, java.lang.String str2) {
        /**
         * 使用equals 方法对String 内容进行比较的。
         */
        return str1.equals(str2);
    }
}
