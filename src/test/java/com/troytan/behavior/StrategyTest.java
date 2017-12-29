package com.troytan.behavior;

import org.junit.Assert;
import org.junit.Test;

import com.troytan.behavior.strategy.CashContext;

/**
 * 策略模式:定义了算法家族，分别封装为不同的类。使得算法可以动态替换，而不影响调用方。
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class StrategyTest {

    @Test
    public void strategyTest() {
        CashContext context = new CashContext("打八折收费");
        Assert.assertTrue(context.countMoney(100d) == 80d);

        context = new CashContext("返现收费");
        Assert.assertTrue(context.countMoney(410d) == 310d);
    }
}
