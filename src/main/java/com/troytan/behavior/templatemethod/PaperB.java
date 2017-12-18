package com.troytan.behavior.templatemethod;

/**
 * 具体实现类，其中第二类答卷，实现具体答案
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class PaperB extends Paper {

    public PaperB(String name){
        super(name);
    }

    @Override
    protected String answerQuestion1() {
        return "是";
    }

    @Override
    protected String answerQuestion2() {
        return "存在";
    }

}
