package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.visitor.Amativeness;
import com.troytan.behavior.visitor.Man;
import com.troytan.behavior.visitor.ObjectStructure;
import com.troytan.behavior.visitor.Success;
import com.troytan.behavior.visitor.Woman;

/**
 * 访问者模式:表示一个作用于某对对象结构(objectStructure)中各元素(element)的操作，它使得不改变各元素类的前提下，定义作用于元素的新操作。
 * 解耦了元素与对其操作的关系。适用于稳定的数据结构，易变的算法场景
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class VisitorTest {

    @Test
    public void visitorTest() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        
        objectStructure.accept(new Success());
        System.out.println("-------------------");
        objectStructure.accept(new Amativeness());
    }
}
