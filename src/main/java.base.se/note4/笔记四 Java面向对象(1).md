# 笔记四  Java 面向对象(1)

[TOC]

## 1.基本定义

### 1.1

> 类 **Class**

- 对 **事物、逻辑、算法**或 **概念**的 **抽象**。
- 描述一类对象的 **行为和状态**。

```java
package note4;

/**
 * @author Calvin
 * @titile: 人类
 * @date 2019/2/20
 * @since 1.0
 */
public class Person {

    /**
     * 状态 -> 属性
     */
    private String sleepState = "睡觉中";

    /**
     * 行为 -> 方法
     */
    public void sleep(){
        System.out.println("人会睡觉");
    }
}

```



> 对象 **Object**

- 对象是类的 **一个实例 **

```java
package note4;

/**
 * @author Calvin
 * @titile: 小明
 * @date 2019/2/20
 * @since 1.0
 */
public class XiaoMing {

    public void personBehavior() {
        /**
         * 对象 -> 类的一个实例
         */
        Person person = new Person();
        person.sleep();
    }

}

```



> 引用 **Reference**

- 使用标识符 **指向一个对象的“引用（reference)”**

```java
    /**
     * @param person -> 根据person -> 引用Person
     */
    public void setPerson(Person person){
       this.person = person;
    }
```



> 构造方法 **Construction**

- 在创建一个对象的时候， **至少有一个构造方法 **.


- 构造方法的 **名称**必须与 **类同名，** **一个类可以有多个构造方法 **.

```java
public class XiaoMing {
    
    private Person person;

    /**
     * 构造方法
     */
    XiaoMing(){
        
    }

    /**
     * 带参构造方法
     */
    XiaoMing(Person person){
        this.person = person;
    }
}    
```



> **this**

- 使用方式：当前对象的调用
```java
    public void setPerson(Person person){
        
        // this  -> XiaoMing 中的属性 
        // 将传入person的值 -> 赋值给 XiaoMing 中的属性 person
       this.person = person;
    }
```

  



> 方法重载 

- 使用方式：同名不同参

```java
package note4;

/**
 * @author Calvin
 * @titile: 人类
 * @date 2019/2/20
 * @since 1.0
 */
public class Person {

    /**
     * 状态 -> 属性
     */
    private String sleepState = "睡觉中";

    /**
     * 行为 -> 方法
     */
    public void sleep(){
        System.out.println("人会睡觉");
    }

    /**
     * 方法重载
     */
    public void sleep(String sleepState){
        System.out.println(sleepState);
    }
}
```





### 1.2

> 抽象类 **abstract**

- 作用：

  - 为 **子类**提供 **通用代码**
  - 为 **子类**提供 **通用方法的定义**

```java
package note4;

/**
 * @author Calvin
 * @titile: 动物 (抽象类)
 * @date 2019/2/20
 * @since 1.0
 */

/**
 * abstract -> 关键字标识为抽象类 
 */
public abstract class Animal {


    /** a.为子类提供通用代码**/
    /** 姓名 */
    private String name;
    /** 性别*/
    private String sex;

    /**b.为子类提供通用方法的定义 **/
    /**
     * 动物有什么行为
     * @return
     */
    public abstract String behavious();
}

```




> 最终 **final** 

- 定义： 最终变量，**不可改变**
- 作用：修饰 **变量、方法、类**


```java
package note4;

/**
 * @author Calvin
 * @titile: 公🐕
 * @date 2019/2/20
 * @since 1.0
 */


/**
 * final -> 修饰 类、变量、方法
         -> 最终变量不可以修改
 */

// 修饰 类
public final class Dog extends Animal{

    // 修饰 变量
    final String SEX = "MALE";

    // 修饰 方法
    @Override
    public final String behavious() {
        return "Dog can wang wang ";
    }
}

```



> 静态 **static** 

- 定义：**静态变量** 属于**类** (类变量)
- 区别：**非静态成员** 属于 **实例 **
- 使用方式：静态成员通常使用 **类名直接调用 **
- 运行方式：被 **static修饰的成员** 将 **最优先加载到内存** 

```java
	   public final static PrintStream out = null;

        // static 类名直接调用
        System.out.println("狗会叫");
```



### 1.3

> 接口 **Interface**

```java
package note4;

/**
 * @author Calvin
 * @titile: USB接口
 * @date 2019/2/20
 * @since 1.0
 */
public interface Usb {
}

```



## 2.内部类

> 定义： 定义在**类内部、方法内部** 或 **局部代码块中的类**
- **非静态** 内部类
   - 定义：依赖于 **外部类对象** 存在

```java
public class OutClass {

    // 外部类的静态成员
    private static String outClassStatisVariable = "OUT_CLASS_STATIC_VARIABLE";

    // 外部类变量
    private String outClassVariable = "OUT_CLASS_VARIABLE";

    /**
     * 2. 非静态内部类 -> 依赖于 外部类对象 存在
     */
    public class InnerClass{
        public void println(){
            // 允许访问 静态 和 非静态 的成员变量
            System.out.println(outClassStatisVariable);
            System.out.println(outClassVariable);
        }
    }

}
```



- **静态** 内部类
   - 定义: 声明在 **内部的类**

   - 注意：

      -  静态内部类 **只能访问外部类的静态成员**  
      -  不能直接访问 **外部类的非静态成员** 

```java
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
}

```



- **局部** 内部类
   - 定义：

      - 声明 **在方法内部** 的类
      - 局部类型，只能在 **局部使用** 
      - 但它的实例，可以转为父类型传递出去

   - 注意：

      - 不可以使用任何访问 **权限修饰符** 
      - 不可以 **直接访问局部变量（方法的参数等效于局部变量）**
      - 如果  **一定需要访问，则需要使用final对局部变量进行修饰**  

```java
package note4.inner;

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


}
```





- **成员** 内部类

   - 定义：内部类的 成员属性（该属性是成员内部类）

```java
package note4.inner;

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
    }

```



- **匿名** 内部类
   - 定义：
     - 就是没有名称的类，其名称由Java编译器给出，
     - 没有名称也就是其他地方就不能引用，不能实例化，只用一次，当然也就不能有构造器。
   - 格式：
     - new 父类（）{子类内容}；
   - 作用：
     - 实现**外部类/接口** 中的**方法**
     - 匿名类可以**访问外部类的成员变量和方法**，匿名类的类体**不可以声明称static成员变量**和**static方法**。
     - 匿名类由于是一个**new的结果**，所以其实可以赋值给一个父类对象。因此可以分为两种匿名类，**成员匿名类**和**局部匿名类（作为函数参数）**

```java
package note4.inner;

/**
 * @author Calvin
 * @titile: 内部类
 * @date 2019/2/20
 * @since 1.0
 */

public class OutClass {


    /**
     * 匿名内部类（成员匿名类） -> 定义: 没有名称也就是其他地方就不能引用，不能实例化，只用一次，            *                               当然也就不能有构造器
     *                      -> 格式: new 父类（）{子类内容}；
     *                      -> 注意事项：可以访问外部类的成员变量和方法
     *                                   不可以声明称static成员变量和static方法。
     *                                   转换成lambda 表达式必须是一个接口
     *                      -> 分类: 成员匿名类和局部匿名类（作为函数参数）
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

```
