package com.troytan.behavior.strategy;

/**
 * 具体算法类:正常收费算法
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(Double money) {
        return money;
    }

}
