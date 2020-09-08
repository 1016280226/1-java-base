package advanced.reflect;

import java.lang.reflect.*;

/**
 * Created by Calvin on 2019/5/8
 * 反射机制
 * 含义： 动态获取这个类的所有信息
 */
public class Reflect {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        /** 1.获取类-三种方法: */
        // 1. 通过 Class.forName 方法中参数必须 包名+类名
        Class classOne = Class.forName("advanced.reflect.User");
        // 2. java 中每个类型都有 class 属性
        Class<User> classTwo = User.class;
        System.out.println(classTwo);
        // 3. java 语言中任何一个 java 对象都有 getClass 方法
        User user = new User(1L, "Calvin", 26);
        Class<? extends User> classTree = user.getClass();

        /** 2.创建对象 */
        // 创建此 Class 对象，表示创建一个新的实例化，调用了 User 的无参数构造方法.
        User user1 = (User) classOne.newInstance();
        // 实例化有参构造函数
        Constructor constructor = classOne.getConstructor(Long.class, String.class, Integer.class);
        User user2 = (User) constructor.newInstance(1L, "Calvin", 26);
        System.out.println("反射创建对象-【无参】构造函数：" + user1);
        System.out.println("反射创建对象-【有参】构造函数：" + user2);

        /** 3.类私有属性赋值 **/

        // 获取到当前 Class 的所有属性
        Field[] declaredFields = classOne.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f.getName());
        }

        // 获取当前 Class 的所有方法
        Method[] methods = classOne.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        Method method = classOne.getMethod("getAge", null);

        // 获取属性字段
        Field declaredField = classOne.getDeclaredField("age");

        // 设置允许访问：true
        declaredField.setAccessible(Boolean.TRUE);
        declaredField.set(user1, 30);

        System.out.println(declaredField.get(user1));
        System.out.println("使用反射-给私有属性赋值:" + user1.getAge());


        Object value = method.invoke(user1, null);
        System.out.println("使用反射-获取方法后，调用方法所返回的值：" + value);
    }

}
