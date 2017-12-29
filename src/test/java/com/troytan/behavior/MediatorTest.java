package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.mediator.China;
import com.troytan.behavior.mediator.Country;
import com.troytan.behavior.mediator.UNSecurityCouncil;
import com.troytan.behavior.mediator.USA;

/**
 * 中介者模式:使用一个中介对象封装一系列的对象交互，中介者使得各对象不需要显示的引用，达到解耦目的。但不适用与多对多的对象交互
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class MediatorTest {

    @Test
    public void mediatorTest() {
        UNSecurityCouncil mediator = new UNSecurityCouncil();
        // 让各对象认识中介者
        Country china = new China(mediator);
        Country usa = new USA(mediator);

        // 让中介者认识对象
        mediator.setChina(china);
        mediator.setUsa(usa);

        china.send("请保持大国友好关系！");
        usa.send("好的，我们合作吧！");

    }
}
