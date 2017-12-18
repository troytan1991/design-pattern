package com.troytan.structure.flyweight;

/**
 * 网站抽象类
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public abstract class WebSite {

    protected String name;

    public WebSite(String name){
        this.name = name;
    }

    public abstract void visit(User user);
}
