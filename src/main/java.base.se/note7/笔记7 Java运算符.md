# 笔记7 Java 运算符

[TOC]

## 1. 算术运行符

| 数据类型   | 符号                                                         |
| ---------- | ------------------------------------------------------------ |
| int        | +, - , *, /, %，++，--                                       |
| double     | +, - , *, /, %，++，--                                       |
| BigDecimal | add（加法）,subtract（减法）,multiply（乘法）,divide（除法） |

```
package note7;

import java.math.BigDecimal;

/**
 * @author Calvin
 * @titile: 算术运算符
 * @date 2019/2/25
 * @since 1.0
 */
public class Arithmetic {

    public static void main(String[] args) {
        // int 类型
        int a = 10;
        int b = 11;
        System.out.println("int type arithmetic");
        System.out.println(a + b); // 加法
        System.out.println(a - b); // 减法
        System.out.println(a * b); // 乘法
        System.out.println(a / b); // 除法
        System.out.println(a % b); // 取模
        System.out.println(a ++);  // 自增 （后加）
        System.out.println(++ a);  // 自增 （先加）
        System.out.println(a --);  // 自减 （后减）
        System.out.println(-- a);  // 自减  （先减）


        // double 类型
        double c = 10;
        double d = 11;
        System.out.println("\ndouble type arithmetic");
        System.out.println(c + d); // 加法
        System.out.println(c - d); // 减法
        System.out.println(c * d); // 乘法
        System.out.println(c / d); // 除法
        System.out.println(c % d); // 取模
        System.out.println(c ++);  // 自增 （后加）
        System.out.println(++ c);  // 自增 （先加）
        System.out.println(c --);  // 自减 （后减）
        System.out.println(-- c);  // 自减  （先减）


        // BigDemical 类型
        BigDecimal e = new BigDecimal(12);
        BigDecimal f = new BigDecimal(13);
        System.out.println("\nBigDemiacl type arithmetic");
        System.out.println(e.add(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 加法
        System.out.println(e.subtract(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 减法
        System.out.println(e.multiply(f).setScale(2, BigDecimal.ROUND_HALF_DOWN)); // 乘法
        System.out.println(e.divide(f).setScale(2,BigDecimal.ROUND_HALF_DOWN)); // 除法
        System.out.println(e.abs()); // 绝对值
    }
}
```



## 2. 关系运算符

| 符号 | 译义                                           | 返回                    |
| ---- | ---------------------------------------------- | ----------------------- |
| ==   | 检查如果两个操作数的值是否**相等**             | true(真)  / false（假） |
| !=   | 检查如果两个操作数的值是否**不相等**           | true(真)  / false（假） |
| >    | 检查左操作数的值是否**大于**右操作数的值       | true(真)  / false（假） |
| <    | 检查左操作数的值是否**小于**右操作数的值       | true(真)  / false（假） |
| > =  | 检查左操作数的值是否**大于或等于**右操作数的值 | true(真)  / false（假） |
| <=   | 检查左操作数的值是否**小于或等于**右操作数的值 | true(真)  / false（假） |

```java
package note7;

import java.math.BigDecimal;

/**
 * @author Calvin
 * @titile: 关系运算符
 * @date 2019/2/25
 * @since 1.0
 */
public class Relation {

    public static void main(String[] args) {
        // int 类型
        int a = 10;
        int b = 11;
        System.out.println("int type relation");
        System.out.println(a == b); // ==
        System.out.println(a != b); // ！=
        System.out.println(a > b);  // >
        System.out.println(a < b);  // <
        System.out.println(a >= b); // >=
        System.out.println(a <= b); // <=


        // BigDemical 类型
        BigDecimal e = new BigDecimal(12);
        BigDecimal f = new BigDecimal(13);
        System.out.println("\nBigDemiacl type arithmetic");
        System.out.println(e.compareTo(f) == 0); // 是否相等
        System.out.println(e.compareTo(f) != 0); // 减法
        System.out.println(e.compareTo(f) == 1); // 大于
        System.out.println(e.compareTo(f) != 1); // 小于
    }
}
```



## 3. 位运算符

> Java 位运算符，应用于byte,short,int,long 等类型上，按位运算

| 符号 | 译义                                                         |
| ---- | ------------------------------------------------------------ |
| &    | 如果相**对应位都（二进制最后一位）1**，则结果为1             |
| \|   | 如果相**对应位都（二进制最后一位）0**，则结果为0，否则为1    |
| ^    | 如果相**对应位值相同**，则结果为0，否则为1                   |
| 〜   | 按位补运算符**翻转**操作数的每一位 （即0变成1，1变成0）      |
| <<   | 按位左移运算符。左操作数按位左移右操作数指定的位数(在低位补0) |
| >>   | **按位右移运算符**。左操作数按位右移右操作数指定的位数(如果值为正，则在高位补0，如果值为负，则在高位补1.) |
| >>>  | **按位右移补零操作符**。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。(采用0扩展机制，也就是说，无论值的正负，都在高位补0.) |



```java
package note7;

/**
 * @author Calvin
 * @titile: 位运算符
 * @date 2019/2/26
 * @since 1.0
 */
public class Bit {

    public static void main(String[] args) {
        int a = 10; // 10 转化成二进制 -> 10/2 = 1010 -> 位数0
        int b = 11; // 11 转化成二进制 -> 11/2 = 1011 -> 位数1

        // & 如果相对应位都是1，则结果为1，否则为0
        System.out.println(a & b); // 结果为 10

        // | 如果相对应位都是0，则结果为0，否则为1
        System.out.println(a | b);  // 结果为11

        // ^ 如果相对应位值相同，则结果为0，否则为1
        System.out.println(a ^ b); // 结果为1

        // 〜 按位补运算符翻转操作数的每一位 （即0变成1，1变成0）
        System.out.println(~b); // 1010

        // << 按位左移运算符。左操作数按位左移右操作数指定的位数(在低位补0)
        System.out.println(a << 2); // 结果为: 40  1010 -> 101000
        System.out.println(a << 3); // 结果为: 80  1010 -> 1010000

        // >> 按位右移运算符。左操作数按位右移右操作数指定的位数(如果值为正，则在高位补0，如果值为负，则在高位补1.)
        System.out.println(a >> 2); // 结果为: 2  1010 -> 10
        System.out.println(a >> 3); // 结果为: 1  1010 -> 1
        
        //  >>> 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。(采用0扩展机制，也就是说，无论值的正负，都在高位补0.)
        System.out.println(100 >>> 2); // 结果: 25
    }
}
```



## 4. 逻辑运算符

| 符号 | 译义                                          |
| ---- | --------------------------------------------- |
| &&   | (并且) 当且仅当两个操作数都为真，条件才为真   |
| \|\| | (或) 如果任何两个操作数任何一个为真，条件为真 |
| ！   | 用来反转操作数的逻辑状态                      |



```java
package note7;

/**
 * @author Calvin
 * @titile: 逻辑运算符
 * @date 2019/2/26
 * @since 1.0
 * 
 * 当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，
 * 但是当得到第一个操作为false时，其结果就必定是false，
 * 这时候就不会再判断第二个操作了。
 */
public class logic {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;

        // && (并且) 当且仅当两个操作数都为真，条件才为真
        System.out.println(c > a && c > b); // 结果: true

        // || (或) 如果任何两个操作数任何一个为真，条件为真
        System.out.println(c > a || c > b); // 结果: true

        // ! 用来反转操作数的逻辑状态
        System.out.println(!(c > a || c > b)); // 结果: false
    }
}
```