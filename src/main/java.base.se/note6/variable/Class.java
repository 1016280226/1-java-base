package note6.variable;

/**
 * @author Calvin
 * @titile: 类变量 (静态变量)
 * @date 2019/2/23
 * @since 1.0
 */
public class Class {

    // 1. 在类中以static关键字声明，但必须在方法构造方法和语句块之外。
    private static String staticVariableForString;


    // 2. 储存在静态存储区,经常被声明为常量,很少单独使用static声明变量。
    private static int  staticVariableForInt;
    private static Boolean staticVariableForBoolean;
    private static Object object;

    /**
     * 2.1 类变量默认值
     */
    public static void defaultValue(){
        // 引用类变量 -> 默认值 null
        System.out.println(staticVariableForString);
        // 数值型类变量 -> 默认值 0
        System.out.println(staticVariableForInt);
        // 布尔型类变量 -> false
        System.out.println(staticVariableForBoolean);
    }


    /**
     * 2.2 静态变量还可以在静态语句块中初始化
     */
    static{
         staticVariableForInt = 1;
         staticVariableForBoolean = Boolean.TRUE;
         object = "引用类型";
    }

    /**
     * 2.3 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。
     */
    public static final String FINAL_STATIC_VARIABLE_FOR_STRING = "最终静态变量";

    public static void main(String[] args) {
        // 1.静态变量在程序开始时创建，在程序结束时销毁。
        System.out.println(Class.staticVariableForString);
        // 1.1 类变量默认值
        Class.defaultValue();
        // 1.3 最终静态变量
        System.out.println(Class.FINAL_STATIC_VARIABLE_FOR_STRING);
    }
}
