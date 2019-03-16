# 笔记十 Java Number & Math 类
[TOC]

## 1.包装类
> 1. 什么是包装类？
>
> ​       包装类: 将 8 种基本数据类型包装成一个类的形式 
>
> 2. 包装类的产生？
>
>    基本数据类型不能够成为对象，所以产生包装类。
>
> 3. 包装类的继承关系？
>
>    - Interger、Byte、Float、Double、Short、Long 都属于Number 类的子类
>    - Character、Boolean 属于 Object 的直接子类
>
> 4. Number 类是一个抽象类，主要将数字包装类中的内容变为基本数据类型
```java
####### Interger、Byte、Float、Double、Short、Long 都属于Number 类的子类 #################
public final class Double extends Number implements Comparable<Double> {...}
public final class Integer extends Number implements Comparable<Integer> {...}
public final class Byte extends Number implements Comparable<Byte> {...}
public final class Float extends Number implements Comparable<Float> {...}
public final class Short extends Number implements Comparable<Short> {...}
public final class Long extends Number implements Comparable<Long> {...}

###### Character、Boolean 属于 Object 的直接子类 #######################################
public final class Character implements Serializable, Comparable<Character> {...}
public final class Boolean implements Serializable, Comparable<Boolean> {...}
```

```java
package java.lang;

################## Number 类是一个抽象类，主要将数字包装类中的内容变为基本数据类型 ###############
public abstract class Number implements java.io.Serializable {
    
    public abstract int intValue();

    public abstract long longValue();
    
    public abstract float floatValue();

    public abstract double doubleValue();
    
    public byte byteValue() {
        return (byte)intValue();
    }

    public short shortValue() {
        return (short)intValue();
    }

    private static final long serialVersionUID = -8742448824652078965L;
}
```



## 2. 装箱和拆箱

> 装箱：将基本数据类型转换成包装类。
>
> 拆箱：将包装类转换成基本数据类型



```java
package note10.number;

/**
 * 包装器
 */
public class Wrapper {

    public Integer binningInt(int i){
        Integer integer = new Integer(i);
        System.out.println(
                new StringBuilder("装箱操作:")
                        .append("使用new Integer(传入int参数),得出数据类型为Integer数为")
                        .append(integer)
                        .toString()
        );
        return integer;
    }


   public int bavenning(Integer i){
       int i1 = i.intValue();
       System.out.println(
               new StringBuilder("拆箱操作:")
               .append("使用intValue(),使得拆箱操作")
               .append(i)
               .toString()
       );
       return i;
   }

   public void autoBinningAndBavenningOfJava5After(){
        int i = 5;
        Integer i1 = i; // 自动装箱
        i= i1;  // 自动拆箱
   }
}

```

