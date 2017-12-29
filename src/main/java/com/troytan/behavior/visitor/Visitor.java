package com.troytan.behavior.visitor;

/**
 * Visitor接口：定义状态接口
 * TODO description
 * @author troytan
 * @date 2017年12月29日
 */
public interface Visitor {

    void getManConclusion(Man man);
    void getWowanConclusion(Woman woman);
}
