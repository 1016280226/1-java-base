package note4.manystate;

import note4.extend.Children;
import note4.extend.Father;

/**
 * @author Calvin
 * @titile: 多态
 * @date 2019/2/21
 * @since 1.0
 */
public class States {

    public static void main(String[] args) {

        // 向上转型
        Father father =  new Children();
        // 父类引用调用的方法是子类覆盖或继承父类的方法,不是父类的方法
        father.haveHealthBody();

        // 通过父类引用变量无法调用子类特有的方法
        // father.speakChinese();

        // 向下转型
        Children children = (Children) new Father();
    }

}
