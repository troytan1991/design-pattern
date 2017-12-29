package com.troytan.behavior.visitor;

/**
 * Element接口：接收状态
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public interface Person {

    // 接受不同的状态
    void accept(Visitor visitor);
}
