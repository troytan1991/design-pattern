package com.troytan.structure.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class ChineseCenter {

    private String name;

    public void jingong() {
        System.out.println(String.format("中国中锋%s进攻", name));
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
    }

    public void fangshou() {
        System.out.println(String.format("中国中锋%s防守", name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
