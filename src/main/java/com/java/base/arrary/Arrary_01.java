package com.java.base.arrary;

import org.junit.Test;

import java.util.Arrays;

/**
 * Arrary 数组
 *
 * 1.底层采用数组方式实现？
 *
 * 2.怎样保存集合存放无限大小？
 *   数组扩容技术
 */
public class Arrary_01 {


    /**
     * 数组扩容技术一:
     *   根据 Arrarys.copyOf 在原来的数组上进行新数上的扩容。
     */
    @Test
    public void arrayExpandMethod1(){
        Object[] arrary = {1,2};
        System.out.println("当前数组长度为:" + arrary.length);

        System.out.println("使用Arrarys.copyOf(原来数组，设置数组长度) 进行扩容");
        Object[] newArrary = Arrays.copyOf(arrary, 10);
        System.out.println("当前新数组长度为:" + newArrary.length);
        Arrays.stream(newArrary).forEach(System.out::println);
    }

    /**
     * 数组扩容技术二:
     */
    @Test
    public void arrayExpandMethod2(){
        Object[] arrary = {0,1,2,3,4,5,6};
        System.out.println("使用System.arraycopy(源数组，源数组的开始下标, 目标数组, 目标数组的开始下标, 需要扩容后素组的长度) 进行扩容");
        /**
         * @param      src      源数组
         * @param      srcPos   源数组的开始下标
         * @param      dest     目标数组
         * @param      destPos  目标数组的开始下标
         * @param      length   需要扩容后素组的长度
         */
        System.arraycopy(arrary,0, arrary, 3, 3);
        //  A 源数组为{0, 1, 2, 3, 4, 5, 6}，从下标为0 -> 对应值0 开始, 复制的长度为3 （length）
        //  再将它copy 到 B新的数组为{0，1，2， 3， 4，5，6}，从下标为3 -> 对应值3 开始,将源数组进行粘贴
        //  形成的新数组{0，1，2，0，1，2，6}，将原有的 3，4，5 给覆盖掉了。
        System.out.println("当前新数组长度为:" + arrary.length);
        Arrays.stream(arrary).forEach(System.out::print);

    }


}
