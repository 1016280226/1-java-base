package note4.extend;

/**
 * @author Calvin
 * @titile:
 * @date 2019/2/21
 * @since 1.0
 */
public class Children extends Father{

    // 不能继承父类私有属性 name' has private access in 'note4.extend.Father'
    // private String name = super.name;

    /**
     * 继承父亲的基因
     */
    private String gene = super.gene;

    /**
     * 继承父类健康身体
     */
    private void extendFatherHealthBody(){
        super.haveHealthBody();
    }

    public void speakEnglish(){
        System.out.println("I can speak English");
    }

    void speakChinese(){
        System.out.println("我会说中文");
    }
}
