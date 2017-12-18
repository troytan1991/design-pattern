package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.facade.Fund;
import com.troytan.structure.facade.Stock1;
import com.troytan.structure.facade.Stock2;
import com.troytan.structure.facade.Stock3;

/**
 * 外观模式：封装复杂底层操作为一个高层操作对外服务，对高层隐藏细节
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class FacadeTest {

    @Test
    public void facadeTest() {
        Fund fund = new Fund(new Stock1(), new Stock2(), new Stock3());
        fund.buyFund();
        fund.sellFund();
    }
}
