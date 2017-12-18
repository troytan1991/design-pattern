package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.state.Context;

/**
 * 状态模式：控制一个对象状态转换条件表达式过于复杂时，把状态的判断逻辑转到不同状态的一系列类中，简化了复杂的判断逻辑
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class StateTest {

    @Test
    public void afterNoonTest() {
        Context context = new Context();

        context.setHour(15f);
        context.doWork();
        context.setHour(10f);
        context.doWork();
        context.setHour(12f);
        context.doWork();
        context.setHour(18f);
        context.doWork();
    }
}
