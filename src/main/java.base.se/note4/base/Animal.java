package note4.base;

/**
 * @author Calvin
 * @titile: 动物 (抽象类)
 * @date 2019/2/20
 * @since 1.0
 */

/**
 * extend -> 关键字标识为抽象类
 */
public abstract class Animal {


    /** 为子类提供通用代码**/
    /** 姓名 */
    private String name;
    /** 性别*/
    private String sex;

    /** 为子类提供通用方法的定义 **/
    /**
     * 动物有什么行为
     * @return
     */
    public abstract String behavious();
}
