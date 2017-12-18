package com.troytan.structure.composite;

import org.apache.commons.lang3.StringUtils;

/**
 * 部门，叶子节点,复用对象
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class ITDepartment extends Company {

    public ITDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("-", depth) + name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + "--" + "履行IT职责");
    }

}
