package note6.instancevariable;

/**
 * @author Calvin
 * @titile: 实例变量
 * @date 2019/2/23
 * @since 1.0
 */
public class InstanceVariable {

    // 1.声明: 在一个类中，但在方法、构造方法和语句块之外；
    // 1.1 访问修饰符可以修饰实例变量；
    private String name;

    // 2.实例变量具有默认值
    private int intVariable;
    private Boolean flag;
    private Object o;


    // 1.4 至少被一个方法、构造方法或者语句块引用, 使得外部能够通过这些方式获取实例变量信息；
    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        // 1.2 JVM 对象创建时 -> 创建
        System.out.println(instanceVariable.name);
        // 1.3 JVM 对象被销毁的时候 -> 销毁

        // 2.1 数值型变量的默认值是 0
        System.out.println(instanceVariable.intVariable);
        // 2.2 布尔型的默认值是 false
        System.out.println(instanceVariable.flag);
        // 2.3 引用类型的默认值是 null
        System.out.println(instanceVariable.o);
    }

}
