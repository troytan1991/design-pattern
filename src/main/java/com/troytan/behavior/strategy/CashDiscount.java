package com.troytan.behavior.strategy;

/**
 * 具体算法类:打折收费算法
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class CashDiscount implements CashSuper {

    private Double discountRate;

    public CashDiscount(Double discountRate){
        this.discountRate = discountRate;
    }

    @Override
    public double acceptCash(Double money) {

        return money * discountRate;
    }

}
