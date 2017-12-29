package com.troytan.behavior.chain;

/**
 * Handler抽象类
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public abstract class Manager {

    // 上一级
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void handleRequest(Request request);
}
