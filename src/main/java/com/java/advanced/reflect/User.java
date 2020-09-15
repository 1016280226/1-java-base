package com.java.advanced.reflect;

/**
 * Created by Calvin on 2019/5/8
 * 用户
 */
public class User {

    /** 用户 ID */
    private Long id;

    /** 用户名 */
    private String username;

    /** 年龄 */
    private Integer age;

    /**
     * 无参构造 (公开)
     */
    public User() {}

    /**
     * 有参构造 (公开)
     *
     * @param id 用户ID
     * @param username 用户名
     */
    public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    /**
     * 设置年龄 （私有方法）
     * @param age 年龄
     */
    private void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取年龄 （公开方法）
     */
    public Integer getAge() {
        return this.age;
    }

}