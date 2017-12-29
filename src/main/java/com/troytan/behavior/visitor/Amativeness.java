package com.troytan.behavior.visitor;

/**
 * 具体visitor,恋爱状态
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class Amativeness implements Visitor {

    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人恋爱时，不懂装懂。");
    }

    @Override
    public void getWowanConclusion(Woman woman) {
        System.out.println("女人恋爱时，懂装不懂。");
    }

}
