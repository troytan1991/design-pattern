package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.flyweight.User;
import com.troytan.structure.flyweight.WebSite;
import com.troytan.structure.flyweight.WebSiteFactory;

public class FlyWeight {

    @Test
    public void flyWeightTest() {
        
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getSharedWebsite("博客");
        webSite.visit(new User());
    }
}
