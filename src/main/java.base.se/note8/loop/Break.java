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
