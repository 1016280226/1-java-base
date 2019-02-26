package note7;

/**
 * @author Calvin
 * @titile: 位运算符
 * @date 2019/2/26
 * @since 1.0
 */
public class Bit {

    public static void main(String[] args) {
        int a = 10; // 10 转化成二进制 -> 10/2 = 1010 -> 位数0
        int b = 11; // 11 转化成二进制 -> 11/2 = 1011 -> 位数1

        // & 如果相对应位都是1，则结果为1，否则为0
        System.out.println(a & b); // 结果为 10

        // | 如果相对应位都是0，则结果为0，否则为1
        System.out.println(a | b);  // 结果为11

        // ^ 如果相对应位值相同，则结果为0，否则为1
        System.out.println(a ^ b); // 结果为1

        // 〜 按位补运算符翻转操作数的每一位
        System.out.println(~b); // 1010

        // << 按位左移运算符。左操作数按位左移右操作数指定的位数(在低位补0)
        System.out.println(a << 2); // 结果为: 40  1010 -> 101000
        System.out.println(a << 3); // 结果为: 80  1010 -> 1010000

        // >> 按位右移运算符。左操作数按位右移右操作数指定的位数(如果值为正，则在高位补0，如果值为负，则在高位补1.)
        System.out.println(a >> 2); // 结果为: 2  1010 -> 10
        System.out.println(a >> 3); // 结果为: 1  1010 -> 1

        //  >>> 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。(采用0扩展机制，也就是说，无论值的正负，都在高位补0.)
        System.out.println(100 >>> 2); // 结果: 25
    }
}
