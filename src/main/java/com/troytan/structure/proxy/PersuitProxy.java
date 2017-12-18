package com.troytan.structure.proxy;

/**
 * 追求者的代理类
 * 
 * @author troytan
 * @date 2017年12月7日
 */
public class PersuitProxy implements GiveGift {

    private Persuit persuit;

    public PersuitProxy(Persuit persuit){
        this.persuit = persuit;
    }

    @Override
    public void giveFlower() {
        persuit.giveFlower();
    }

    @Override
    public void giveMilk() {
        persuit.giveMilk();
    }

    @Override
    public void giveMoney() {
        persuit.giveMoney();
    }

}
