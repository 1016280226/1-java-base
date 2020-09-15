package com.java.base.object.manystate;

/**
 * @author Calvin
 * @titile: 多态
 * @date 2019/2/22
 * @since 1.0
 */
public class Parent {

    /**
     * fun1()
     **/
    public void fun1() {
        System.out.println("【执行的是父类fun1】");
    }

    /**
     * fun2()
     **/
    public void fun2() {
        this.fun1();
    }
}

/**
 * 子类A继承父类
 */
class Children1 extends Parent {

    /**
     * 重载 -> 父类fun1()
     */
    @Override
    public void fun1() {
        System.out.println("【执行的是子类A fun1】");
    }

    /**
     * 自定义方法fun3
     */
    public void fun3() {
        System.out.println("【执行的是子类A fun3】");
    }
}

/**
 * 子类B继承父类
 */
class Children2 extends Parent {

    /**
     * 重载 -> 父类fun1()
     */
    @Override
    public void fun1() {
        System.out.println("【执行的是子类B fun1】");
    }

    /**
     * 自定义方法fun4
     */
    public void fun4() {
        System.out.println("【执行的是子类A fun4】");
    }
}


/**
 * Created by Calvin on 2018/6/5
 * 向上转型
 * 父类 = 子类实例化
 */
class Upcasting {

    public static void main(String[] args) {
        Children1 children = new Children1();
        Parent parent = children; // 向上转型：父类 = 子类实例化
        parent.fun1();            // 【执行的是子类A fun1】
    }
}


/**
 * Created by Calvin on 2018/6/5
 * 向下转型
 * 子类 = 父类实例化
 * ps:
 * 1.向下转型，必须先向上转型（确立父子关系），才能进行向下转型。
 * 2.如果单一的向下转型，报错：转换异常。
 */
class Downcasting {

    public static void main(String[] args) {

        Parent parent = new Children1();          // 向上转型（确立关系）
        Children1 children = (Children1) parent;  // 向下转型
        children.fun1();                          // 调用方法被复写 【执行的是子类A fun1】
        children.fun2();                          // 调用父类的方法 【执行的是父类fun1】
        children.fun3();                          // 调用子类自定义的方法 【执行的是子类A fun3】
    }
}


/**
 * Created by Calvin on 2018/6/6
 * 向上转型功能代码
 */
class PolymorphicFunction {

/********************************************* 不使用多态 ****************************/
    /**
     * 缺点: 每一拓展子类,每一次都fun()方法都要重载一次。
     * A==>>B,C,D
     */
    public void unUsedPolymorphic() {
        unfun(new Children1());
        unfun(new Children2());
    }

    public void unfun(Children1 children1) {
        children1.fun1();
    }

    public void unfun(Children2 children2) {
        children2.fun1();
    }

    /********** 使用多态: 实现父类下任意子类对象，并调用方法 ***********************/

    public void usePolymorphic() {
// 父类的通用方法 fun1 -> 只要向上转型实例其中一个子类 -> 就能获取到子类重载父类的方法 -> 使用的是子类的方法
        fun(new Children1());
        fun(new Children2());
    }

    public void fun(Parent parent) {
        parent.fun1();
    }
}
