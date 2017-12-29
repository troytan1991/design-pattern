package com.troytan.structure.flyweight;

/**
 * 分离变化的部分，实现共享的部分内部状态不变
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class User {

    private String  name;
    private Integer age;

    public User(String name, Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
