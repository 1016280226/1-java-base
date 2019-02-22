# 笔记四 Java面向对象对象(3)

## 1. 创建对象

### 1.1 声明

> 声明一个对象，包括**对象名称**和**对象类型**

### 1.2 实例化

> 使用关键字**new**来创建一个对象

### 1.3 初始化

> 使用new创建对象时，会**调用构造方法**初始化对象

```java
package note4.instance;

/**
 * @author Calvin
 * @titile:
 * @date 2019/2/22
 * @since 1.0
 */

/**
 * 1. 创建对象
 */
public class Object {     // 对象名称
    private String name;  // 对象名称


    public static void main(String[] args) {
        /** 2. 使用关键字new来创建一个对象, 使用new创建对象时，会调用构造方法初始化对象 **/
        Object object = new Object();
    }
}
```



## 2. 访问实例变量和方法

> 通过已**创建的对象**来访问**成员变量**和**成员方法**

```java
// 声明和实例化对象 
Object object = new Object();
// 访问类中的方法
String calvin = object.setName("Calvin");
// 访问其中的变量
String calvin2 = object.name;
```



## 3.源文件声明规则

>    1.一个源文件中只能有一个**public类**
>
> 2. 一个源文件可以有**多个非public类**
> 3. **源文件的名称**应该和**public类的类名**保持一致
> 4. 如果一个类定义在某个包中，那么**package语句应该在源文件的首行**
> 5. 如果源文件包含**import语句**，那么应该放在**package语句和类定义之间**。如果没有package语句，那么import语句应该在源文件中最前面
> 6. import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
>
> 