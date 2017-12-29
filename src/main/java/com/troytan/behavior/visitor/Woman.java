package com.troytan.behavior.visitor;

/**
 * 具体element类，女人
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class Woman implements Person {

    @Override
    public void accept(Visitor visitor) {
        visitor.getWowanConclusion(this);
    }

}
