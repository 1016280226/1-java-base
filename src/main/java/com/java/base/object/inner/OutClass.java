package com.java.base.object.inner;

/**
 * @author Calvin
 * @titile: 内部类
 * @date 2019/2/20
 * @since 1.0
 */

public class OutClass {

    // 外部类的静态成员
    private static String outClassStatisVariable = "OUT_CLASS_STATIC_VARIABLE";

    // 外部类变量
    private String outClassVariable = "OUT_CLASS_VARIABLE";

    /**
     *  1.静态内部类
     */
    public static class NestedStaticClass{

        // 不能直接访问外部类的非静态成员
        // this.outClassVariable

        // 只允许访问外部类的静态成员
        public void printlnOutMessage(){
            System.out.println(OutClass.outClassStatisVariable);
        }

    }

    /**
     * 2. 非静态内部类 -> 依赖于 外部类对象 存在
     */
    public class InnerClass{

        /**
         * 4.成员内部类 -> 内部类的属性（该属性是成员内部类）
         */
        public class MemberInnerClass{

            private String memberInnerVariable = "MEMBER_INNER_VARIABLE";

            public void println(){
                System.out.println(memberInnerVariable);
            }
        }

        public void println(){
            // 允许访问 静态 和 非静态 的成员变量
            System.out.println(outClassStatisVariable);
            System.out.println(outClassVariable);
        }
    }


    public void printlnPartInnerMethod(){

        /**
         * 3.局部内部类 -> 声明 在方法内部 的类
         *              -> 不可以使用任何访问 权限修饰符
         *              -> 不可以 直接访问局部变量
         *              -> 一定需要访问，则需要使用final对局部变量进行修饰
         */
        class PartInnerClass{

            private String partInnerVariable = "PART_INNER_VARIABLE";

            public void println(){
                System.out.println(partInnerVariable);
            }
        }
    }

    /**
     * 匿名内部类（成员匿名类） -> 定义: 没有名称也就是其他地方就不能引用，不能实例化，只用一次，当然也就不能有构造器
     *                          -> 格式: new 父类（）{子类内容}；
     *                          -> 注意事项：可以访问外部类的成员变量和方法
     *                                       不可以声明称static成员变量和static方法。
     *                                       转换成lambda 表达式必须是一个接口
     *                          -> 分类: 成员匿名类和局部匿名类（作为函数参数）
     *
     */

    // 成员匿名类 -> OutClass hiddenInnerClass下的成员变量
   public OutClass hiddenInnerClass  = new OutClass(){

       // 不可以声明称static成员变量和static方法。
       // static String variable;

        private String hiddenInnerClassVariable = "HIDDEN_INNER_CLASS_VARIABLE";

        public void println(){
            System.out.println(hiddenInnerClassVariable);
        }

    };

}
