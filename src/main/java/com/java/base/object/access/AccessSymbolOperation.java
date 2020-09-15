package com.java.base.object.access;

/**
 * @author Calvin
 * @titile: 访问控制符操作步骤
 * @date 2019/2/21
 * @since 1.0
 */
public class AccessSymbolOperation {

    // 修改属性的可见性来限制对属性的访问
    private String message;
    private String title;

    public AccessSymbolOperation(String message, String title) {
        this.message = message;
        this.title = title;
    }

    // 为每个属性创建一对赋值(setter)方法和取值(getter)方法，用于对这些属性的存取
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        // 在赋值方法中,加入对属性的存取控制语句
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
