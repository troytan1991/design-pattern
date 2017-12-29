package com.troytan.behavior.strategy;

/**
 * 上下文类:cash上下文
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type){
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "打八折收费":
                cashSuper = new CashDiscount(0.8d);
                break;
            case "返现收费":
                cashSuper = new CashReturn(300d, 100d);
                break;
            default:
                break;
        }
    }

    public double countMoney(Double money) {
        return cashSuper.acceptCash(money);
    }
}
