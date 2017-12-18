package com.troytan.structure.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 具体公司，非叶子节点
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class ConcreateCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreateCompany(String name){
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("-", depth) + name);
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void performDuty() {
        for (Company company : children) {
            company.performDuty();
        }
    }

}
