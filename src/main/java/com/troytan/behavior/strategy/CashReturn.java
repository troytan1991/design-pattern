package com.troytan.behavior.strategy;

/**
 * 具体算法类:返现算法
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class CashReturn implements CashSuper {

    private Double conditionMoney;
    private Double returnMoney;

    public CashReturn(Double conditionMoney, Double returnMoney){
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(Double money) {

        return money >= conditionMoney ? money - returnMoney : money;
    }

}
