package com.troytan.behavior.visitor;

/**
 * 具体element,男人
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class Man implements Person {

    @Override
    public void accept(Visitor visitor) {
        visitor.getManConclusion(this);
    }

}
