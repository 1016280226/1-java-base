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
