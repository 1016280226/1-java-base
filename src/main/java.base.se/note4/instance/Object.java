package note4.instance;

/**
 * @author Calvin
 * @titile:
 * @date 2019/2/22
 * @since 1.0
 */

/**
 * 1. 创建对象
 *
 *
 */
public class Object {     // 对象名称
    private String name = "Calvin";  // 对象名称

    public String setName(String name){
        return this.name = name;
    };


    public static void main(String[] args) {
        /** 2. 使用关键字new来创建一个对象, 使用new创建对象时，会调用构造方法初始化对象 **/
        // 声明和实例化对象
        Object object = new Object();
        // 访问类中的方法
        String calvin = object.setName("Calvin");
        // 访问其中的变量
        String calvin2 = object.name;
    }
}
