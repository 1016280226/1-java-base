# 笔记九 Java分支结构

[TOC]

## 1.1 If 语句

> 格式1： if(布尔表达式){ //如果布尔表达式为true将执行的语句 }
>
> 格式2： if(布尔表达式){ //如果布尔表达式为true将执行的语句 }else{ false 时，else 语句块会被执行 }
>
> 格式3： if(布尔表达式){ //如果布尔表达式为true将执行的语句 }else if(布尔表达式){ }else{}

```java
package note9.branch;

/**
 * @author Calvin
 * @titile: if 语句
 * @date 2019/3/5
 * @since 1.0
 * @format1 if(布尔表达式){ //如果布尔表达式为true将执行的语句 }
 * @format2 if(布尔表达式){ //如果布尔表达式为true将执行的语句 }else{ false 时，else 语句块会被执行 }
 * @format3 if(布尔表达式){ //如果布尔表达式为true将执行的语句 }else if(布尔表达式){ }else{}
 *
 */
public class If_else {

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;
        if(a > b){
            System.out.println(a);
        }else if(b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
```



## 1.2 switch 语句

> 含义：switch 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
>
> 格式：switch(变量){ case 参数: 实现体; break; case ... break; default: ...}
>
> 注意：switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串类型了，同时 case 标签必须为字符串常量或字面量。

```java
package note9.branch;

/**
 * @author Calvin
 * @titile: switch 语句
 * @date 2019/3/5
 * @implication switch 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
 * @mind1 switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串类型了，同时 case 标签必须为字符串常量或字面量。
 * @mind2 当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
 * @mind3 当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
 * @mind4 switch 语句可以包含一个 default 分支，该分支必须是 switch 语句的最后一个分支。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
 * @since 1.0
 */
public class Switch {

    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(i);
                break;
            case 2:
                System.out.println(i);
                break;
            case 3:
                System.out.println(i);
                break;
            default:
                System.out.println(i);
        }
    }
}

```



