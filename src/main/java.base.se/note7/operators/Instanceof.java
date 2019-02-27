package note7.operators;

import note4.extend.Children;
import note4.extend.Father;

/**
 * @author Calvin
 * @titile: instance of  运算符
 * @date 2019/2/27
 * @since 1.0
 * @implication 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）
 * @format ( Object reference variable ) instanceof  (class/interface type)
 */
public class Instanceof {

    public static void main(String[] args) {
        Children children = new Children();
        if(children instanceof Father){
        }

    }
}
