package com.troytan.behavior.templatemethod;

/**
 * 模版方法父类抽象类：定义操作中的算法骨架(共同抽象部分)，将差异部分延迟到子类实现。这里定义试卷的问题以及答案格式
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public abstract class Paper {

    protected String studentName;

    public Paper(String name){
        this.studentName = name;
    }

    public void testQuestion1() {
        System.out.println("问题一:地球是圆的吗？");
        System.out.println(String.format("%s答案:%s", studentName, answerQuestion1()));
    }

    public void testQuestion2() {
        System.out.println("问题二:外星文明存在吗？");
        System.out.println(String.format("%s答案:%s", studentName, answerQuestion2()));
    }

    protected abstract String answerQuestion1();

    protected abstract String answerQuestion2();
}
