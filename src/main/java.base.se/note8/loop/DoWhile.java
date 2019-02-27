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
