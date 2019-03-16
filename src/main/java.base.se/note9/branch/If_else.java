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
