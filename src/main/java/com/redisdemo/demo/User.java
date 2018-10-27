package com.redisdemo.demo;

import java.io.Serializable;

/**
 * Created by lvxin
 */
//必须使用时间序列化接口，使用Jackson做序列化需要一个空构造
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private  String id;
    private String username;
    private Integer age;

    public User(){
        super();
    }

    public User(String username, Integer age,String id) {
        super();
        this.username = username;
        this.age = age;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
