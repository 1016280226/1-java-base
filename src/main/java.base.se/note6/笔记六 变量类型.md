# 笔记六 Java 变量类型

## 1. 局部变量
> 1. 局部变量**声明**在**方法**、**构造方法**或者**语句块**中；
> 2. 局部变量在**方法**、**构造方法**、或者**语句块**被**执行的时**候**创建**，当它们**执行完成后**，**变量**将会**被销毁**；
> 3. **访问修饰符不能**用于局部变量；
> 4. 局部变量是在**栈上分配**的。
> 5. 局部变量**没有默认值**，所以**局部变量被声明后，必须经过初始化，才可以使用**。

```java
package note6.partvariable;

import java.util.function.Consumer;

/**
 * @author Calvin
 * @titile: 局部变量
 * @date 2019/2/22
 * @since 1.0
 */

/**
 *  JVM:
 *      1.执行的时 -> 创建
 *      2.执行完   -> 被销毁
 *      3.局部变量是在栈上分配的。
 */
public class PartVariable {

    PartVariable(){

        // 声明: 在构造方法
        int b = 1;

    }

    public void partVariableDefine(){

        // 声明: 在方法 (局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。)
        Integer a; // 包装类默认值为 null

        Consumer consumer = (o) -> {

            // 声明: 语句块中
            int c = 5; // 默认值 为0
            o = c;
        };

        // 注意: 访问修饰符不能用于局部变量 (Modifier 'private' not allowed here)
        //private int d;
    }
}

```



## 2. 实例变量
>  	1. 实例变量声明在**一个类中**，但在方法、构造方法和语句块之外；
>  	  2. 实例变量在**对象创建的时候创建**，在**对象被销毁的时候销毁**；
>  	  3. 实例变量的值应该**至少被一个方法、构造方法或者语句块引用**，使得**外部**能够通过这些**方式获取实例变量信息**；
>  	  4. **访问修饰符可以**修饰实例变量；
>  	  5. 实例变量对于**类中的方法、构造方法或者语句块是可见的**。
>  	   	1. 一般情况下应该把实例变量**设为私有**。通过**使用访问修饰符可以使实例变量对子类**可见;
>
>  	2. 实例变量**具有默认值**。
>  	    1. **数值型变量**的默认值是**0**，
>  	    2. **布尔型变量**的默认值是**false**，
>  	    3. **引用类型变量**的默认值是**nul**l。
>  	3. 实例变量可以**直接通过变量名访问**。但在**静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。**

```java
package note6.partvariable.instancevariable;

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
```



## 3. 类变量（静态变量）
>    		 1. 类变量也称为**静态变量**，
>             		 1. 在类中以**static关键字**声明，但**必须在方法构造方法和语句块之外**。
>    		 2. 静态变量储存在**静态存储区**。**经常被声明为常量**，很少**单独使用static声明变量**。
>    		 3. 静态变量在**程序开始时创建**，在**程序结束时销毁**。
>    		 4. 与实例变量具有相似的可见性。但为了对类的使用者可见，**大多数静态变量声明为public类型**。
>    		 5. 默认值和实例变量相似。
>             		 1. 数值型变量默认值是0，
>             		 2. 布尔型默认值是false，
>             		 3. 引用类型默认值是null。
>             		 4. 变量的值可以在声明的时候指定，**也可以在构造方法中指定**。
>             		 5. 此外，静态变量还可以在**静态语句块中初始化**。
>    		 6. 静态变量可以通过：ClassName.VariableName的方式访问。
>    		 7. 类变量被声明为**public static final类型时**，类变量名称**一般建议使用大写字母**。
>             		 1. 如果**静态变量不是public和final类型**，其命名方式与实例变量以及局部变量的命名方式一致。

```java
package note6.classVariable;

import java.sql.SQLOutput;

/**
 * @author Calvin
 * @titile: 类变量 (静态变量)
 * @date 2019/2/23
 * @since 1.0
 */
public class ClassVariable {

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
        System.out.println(ClassVariable.staticVariableForString);
        // 1.1 类变量默认值
        ClassVariable.defaultValue();
        // 1.3 最终静态变量
        System.out.println(ClassVariable.FINAL_STATIC_VARIABLE_FOR_STRING);
    }
}

```



# 4.程序运行时的区别

> 1. 实例变量属于某个对象的属性，必须**创建了实例对象**，其中的实例变量**才会被分配空间**，**才能使用这个实例变量**。
>    ​2. 静态变量不属于某个实例对象，而是属于类，所以也称为类变量，只要程序**加载了类的字节码**，不用创建任何实例对象，静态变量就会**被分配空间**，**静态变量就可以被使用了**

