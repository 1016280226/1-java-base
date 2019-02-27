package note7.operators;

/**
 * @author Calvin
 * @titile: 三目运算符
 * @date 2019/2/27
 * @since 1.0
 * @format variable x = (expression) ? value if true : value if false
 * @implication 条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量
 */
public class ThreeElements {

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
