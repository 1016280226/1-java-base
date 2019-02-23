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
