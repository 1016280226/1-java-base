package com.java.base.object.base;


/**
 * @author Calvin
 * @titile: 构造方法
 * @date 2019/2/20
 * @since 1.0
 */
public class XiaoMing {

    private Person person;

    /**
     * 构造方法
     */
    XiaoMing(){

    }

    /**
     * 带参构造方法
     */
    XiaoMing(Person person){
        this.person = person;
    }


    public void personBehavior() {
        /**
         * 对象 -> 类的一个实例
         */
        Person person = new Person();
        person.sleep();
    }


    /**
     * @param person -> 根据person -> 引用Person
     */
    public void setPerson(Person person){

        // this  -> XiaoMing 中的属性
        // 将传入person的值 -> 赋值给 XiaoMing 中的属性 person
       this.person = person;
    }

}
