# 笔记八 Java循环结构

[TOC]

## 1.1 while 循环

> 格式： while( 布尔表达式 ) { //循环内容}
>
> 注意： 只要布尔表达式为 true，循环体会一直执行下去

```java
package note8.loop;

/**
 * @author Calvin
 * @titile: While 循环
 * @date 2019/2/27
 * @since 1.0
 * @format while(布尔表达式) { //循环内容 }
 * @mind  只要布尔表达式为 true，循环体会一直执行下去
 */
public class While {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int recordeTimes = 0;
        // 当 b 小于 10 时， 跳出循环
        while(a < b){ // 为true，继续循环， false 跳出循环
            b--;
            System.out.println("b:" + b);
            System.out.println(++ recordeTimes + "次数");
        }
    }
}

```



## 1.2 do...while 循环

> 格式：do { //代码语句 }while(布尔表达式);
>
> 注意：对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，**也至少执行一次**

```java
package note8.loop;

/**
 * @author Calvin
 * @titile: do...while 循环
 * @date 2019/2/27
 * @since 1.0
 * @mind 对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次
 * @format do { //代码语句 } while (布尔表达式);
 */
public class DoWhile {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int recordeTimes = 0;


       do{
           //执行第一次
           b--; // 100 -> 99
           System.out.println("b:" + b); // b: 99
           System.out.println(++ recordeTimes + "次数"); // 1 次数
       }while (a < b);
    }
}

```



## 1.3 for 循环

```java
package note8.loop;

import note6.variable.Instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Calvin
 * @titile: For 循环
 * @date 2019/2/27
 * @since 1.0
 * @format1 for(初始化 ; 布尔表达式 ; 更新) { //代码语句}
 * @format2 for(声明语句 : 表达式){ //代码句子 } (Java 增强 for 循环)
 * @implication 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
 */
public class For {

    public static void main(String[] args) {
        // 格式: for(初始化 ; 布尔表达式 ; 更新) { //代码语句}
        for(int i = 0; i< 100; i++){
            System.out.println(i);
        }

        // Java 增强 for 循环
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer i : integers){
            System.out.println(i);
        }
    }
}

```



## 1.4 break 关键字

> 含义：break 跳出最里层的循环，并且继续执行该循环下面的语句。
>
> 注意：主要用在循环语句或者 switch 语句中，用来跳出整个语句块。

```java
package note8.loop;

/**
 * @author Calvin
 * @titile: Break 关键字
 * @date 2019/2/27
 * @since 1.0
 * @mind break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
 * @implication break 跳出最里层的循环，并且继续执行该循环下面的语句。
 */
public class Break {

    public static void main(String[] args) {

        for(int i = 0; i< 100; i++){

            if(i == 80){
                break;  // 跳出循环
            }
            System.out.println(i);
        }
    }
}
```



## 1.5 continue 关键字

> 含义：continue 适用于任何循环控制结构中。
>
> 作用：是让程序立刻跳转到下一次循环的迭代
>
> 注意：
>
> ​	1.在 for 循环中，continue 语句使程序立即跳转到更新语句。
>
> ​        2.在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。

```java
package note8.loop;

import java.util.Arrays;
import java.util.List;

/**
 * @author Calvin
 * @titile: Continue 关键字
 * @date 2019/2/27
 * @since 1.0
 * @mind continue 适用于任何循环控制结构中。
 * @effect 作用是让程序立刻跳转到下一次循环的迭代。
 * @mind1 在 for 循环中，continue 语句使程序立即跳转到更新语句。
 * @mind2 在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
 */
public class Continue {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer i : integers){
          if(i == 3){
              update(i);
              continue;
          }else{
              System.out.println(i);
          }
        }
    }


    public static void update(Integer i){
        System.out.println("continue" + i);
    }

}

```

