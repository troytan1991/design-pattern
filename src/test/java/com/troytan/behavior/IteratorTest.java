package com.troytan.behavior;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import com.troytan.behavior.iterator.TestArrayList;

/**
 * 迭代器模式：提供一种方法顺序访问一个聚合对象的各个元素，而不暴露该对象的内部表示
 * 
 * @author troytan
 * @date 2018年1月3日
 */
public class IteratorTest {

    @Test
    public void iteratorTest() {
        TestArrayList<String> list = new TestArrayList<>();
        list.addAll(Arrays.asList("t1", "t2", "t3"));
        Iterator<String> iterator = list.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
