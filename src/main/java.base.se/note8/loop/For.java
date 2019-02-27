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
