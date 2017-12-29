package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.flyweight.User;
import com.troytan.structure.flyweight.WebSite;
import com.troytan.structure.flyweight.WebSiteFactory;

/**
 * 享元模式：运用共享技术，有效的复用实例
 * 
 * @author troytan
 * @date 2017年12月18日
 */

public class FlyWeight {

    @Test
    public void flyWeightTest() {

        WebSiteFactory factory = new WebSiteFactory();
        WebSite blog1 = factory.getSharedWebsite("博客");
        blog1.visit(new User("troy", 25));
        WebSite blog2 = factory.getSharedWebsite("博客");
        blog2.visit(new User("alice", 20));
        WebSite order = factory.getSharedWebsite("订单");
        order.visit(new User("alice", 20));
        System.out.println("网站实例数:" + factory.getCount());

    }
}
