# 笔记七 Java 运算符

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
package note7.operators;

/**
 * @author Calvin
 * @titile: 位运算符
 * @date 2019/2/26
 * @since 1.0
 */
public class Bit {

    public static void main(String[] args) {
        int a = 10; // 10 转化成二进制 -> 10/2 = 1010 -> 位数0
        int b = 12; // 12 转化成二进制 -> 12/2 = 1100 -> 位数0

        // & 如果相对应位都是1，则结果为1，否则为0
        System.out.println(a&b); // a 的二进制 1010 ，b 的二级制 1100 -> 1000 -> 结果: 8 (十进制)

        // | 如果相对应位都是0，则结果为0，否则为1
        System.out.println(a | b);  // a 的二进制 1010 ，b 的二级制 1100 -> 1110 -> 结果: 14 (十进制)

        // ^ 如果相对应位值相同，则结果为0，否则为1
        System.out.println(a ^ b); // a 的二进制 1010 ，b 的二级制 1100 -> 0110 -> 结果: 6 (十进制)

        // 〜 按位补运算符翻转操作数的每一位，即0变成1，1变成0
        /** b 的二级制 1100 -> 0011 (即0变成1，1变成0)
         *                 -> 0011 - 0001(减掉 二进制 1)
         *                 -> 0010
         *                 -> 1101 ((即0变成1，1变成0))
         *  最终结果: -13
         */
        System.out.println(~b);

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



## 5. 赋值运算符

| 符号 | 译义               |
| ---- | ------------------ |
| =    | 赋值运算符         |
| + =  | 加和赋值操作符     |
| - =  | 减和赋值操作符     |
| * =  | 乘和赋值操作符     |
| / =  | 除和赋值操作符     |
| ％=  | 取模和赋值操作符   |
| << = | 左移位赋值运算符   |
| >> = | 右移位赋值运算符   |
| ＆=  | 按位与赋值运算符   |
| ^ =  | 按位异或赋值操作符 |
| =    | 按位或赋值操作符   |



```java
package note7.operators;

/**
 * @author Calvin
 * @titile: 赋值运算符
 * @date 2019/2/26
 * @since 1.0
 */
public class Assignment {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        // = 赋值运算符 (b 赋值 c) -> c = 11
        int c = b;
        System.out.println(c);

        // += 加和赋值操作符 (d + c) -> d =  12 + 11
        int d = 12;
        d += c;
        System.out.println(d);

        // -= 加和赋值操作符 (d - c) -> d = 23 - 11
        d -= c;
        System.out.println(d);

        // *= 乘和赋值操作符 (d * c) -> d = 12 * 11
        d *= c;
        System.out.println(d);

        // /= 除和赋值操作符 (d / c) -> d = 132 / 11
        d /= c;
        System.out.println(d);

        // % = 取模和赋值操作符 (d % c) -> d = 12 % 11
        d %= c;
        System.out.println(d);

        // <<= 左移位赋值运算符 d << c ->  1 << 11 -> 1 （二进制）-> 100000000000 (向左移动11位，低位补0)
        d <<= c;
        System.out.println(d);

        // >>= 右移位赋值运算符 d >> c ->  2048 >>11 -> 100000000000 （二进制）-> 1 (向右移动11位，低位补0)
        d >>= c;
        System.out.println(d);

        // &= 按位与赋值运算符 d & c -> d 是 1 (二进制)，c 是 1011 （如果相对应位都是1，则结果为1，否则为0) -> 结果 1
        d &= c;
        System.out.println(d);

        // ^= 按位异或赋值操作符 d ^ c
        d ^= c;
        System.out.println(d);

        // |= 按位异或赋值操作符 d | c
        d |= c;
        System.out.println(d);

    }
}

```



## 6. 其他运算符

### 6.1 三目运算符

> 含义：条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量
>
> 格式：variable x = (expression) ? value if true : value if false

```java
package note7.operators;

/**
 * @author Calvin
 * @titile: 三目运算符
 * @date 2019/2/27
 * @since 1.0
 * @format variable x = (expression) ? value if true : value if false
 * @implication 条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量
 */
public class threeElements {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        System.out.println(a > b ? a : b);

        //  System.out.println(a > b ? a : b); 翻译
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

```



### 6.2 instanceof 运算符

> 含义：该运算符用于操作**对象实例**，检查该**对象是否是一个特定类型**（类类型或接口类型）
>
> 格式：( Object reference variable ) instanceof  (class/interface type)

```java
package note7.operators;

import note4.extend.Children;
import note4.extend.Father;

/**
 * @author Calvin
 * @titile: instance of  运算符
 * @date 2019/2/27
 * @since 1.0
 * @implication 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）
 * @format ( Object reference variable ) instanceof  (class/interface type)
 */
public class Instanceof {

    public static void main(String[] args) {
        Children children = new Children();
        if(children instanceof Father){
        }
            
    }
}

```



## 7. 运算符优先级

| 译义     | 符号                                       | 优先级   |
| -------- | ------------------------------------------ | -------- |
| 一元     | + + - ！〜                                 | 从右到左 |
| 乘性     | * / ％                                     | 左到右   |
| 加性     | + -                                        | 左到右   |
| 移位     | >> >>>  <<                                 | 左到右   |
| 关系     | >> = << =                                  | 左到右   |
| 相等     | ==  !=                                     | 左到右   |
| 按位与   | ＆                                         | 左到右   |
| 按位异或 | ^                                          | 左到右   |
| 按位或   | \|                                         | 左到右   |
| 逻辑与   | &&                                         | 左到右   |
| 逻辑或   | \|\|                                       | 左到右   |
| 条件     | ？：                                       | 从右到左 |
| 赋值     | = + = - = * = / =％= >> = << =＆= ^ = \| = | 从右到左 |
| 逗号     | ，                                         | 左到右   |
| 后缀     | () [] . (点操作符)                         | 左到右   |

