package com.troytan.structure.proxy;

/**
 * 被追求者(作用)对象
 * 
 * @author troytan
 * @date 2017年12月7日
 */
public class Girl {

    private String  name;
    private Integer age;

    public Girl(String name, Integer age){
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
