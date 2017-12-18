package com.troytan.structure.proxy;

public class Persuit implements GiveGift {

    private Girl girl;

    public Persuit(Girl girl){
        this.girl = girl;
    }

    @Override
    public void giveFlower() {
        System.out.println("送鲜花给" + girl.getName());
    }

    @Override
    public void giveMilk() {
        System.out.println("送牛奶给" + girl.getName());
    }

    @Override
    public void giveMoney() {
        System.out.println("送钱给" + girl.getName());
    }

}
