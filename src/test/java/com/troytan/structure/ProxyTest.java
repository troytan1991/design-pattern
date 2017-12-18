package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.proxy.Girl;
import com.troytan.structure.proxy.Persuit;
import com.troytan.structure.proxy.PersuitProxy;

/**
 * 代理者模式
 * 
 * @author troytan
 * @date 2017年12月7日
 */
public class ProxyTest {

    @Test
    public void proxyTest() {
        Persuit persuit = new Persuit(new Girl("alice", 22));

        PersuitProxy proxy = new PersuitProxy(persuit);
        proxy.giveFlower();
        proxy.giveMilk();
        proxy.giveMoney();

    }
}
