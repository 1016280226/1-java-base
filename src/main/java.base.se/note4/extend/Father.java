package note4.extend;

/**
 * @author Calvin
 * @titile: 继承
 * @date 2019/2/21
 * @since 1.0
 */
public class Father {

    /**
     *  基因
     */
    protected String gene;

    /**
     * 名称
     */
    private String name = "Calvin";

    /**
     * 不健康身体
     */
    public void haveHealthBody(){
        System.out.println("BAD_BODY");
    }
}
