package com.troytan.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类：包含element集合，可以提供一个高层的接口以允许访问者访问它的元素
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class ObjectStructure {

    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void accept(Visitor visitor) {
        for (Person person : persons) {
            person.accept(visitor);
        }
    }
}
