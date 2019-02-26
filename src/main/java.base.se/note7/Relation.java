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
