package com.troytan.behavior.mediator;

/**
 * colleague抽象类：国家父类
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }

    public abstract void send(String msg);

    public abstract void notify(String msg);
}
