package com.troytan.structure.facade;

/**
 * 业务层-高层
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;

    public Fund(Stock1 stock1, Stock2 stock2, Stock3 stock3){
        this.stock1 = stock1;
        this.stock2 = stock2;
        this.stock3 = stock3;
    }

    public void sellFund() {
        stock1.sell1();
        stock2.sell2();
        stock3.sell3();
    }

    public void buyFund() {
        stock1.buy1();
        stock2.buy2();
        stock3.buy3();
    }
}
