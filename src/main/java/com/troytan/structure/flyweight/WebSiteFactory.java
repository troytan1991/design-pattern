package com.troytan.structure.flyweight;

import java.util.HashMap;

/**
 * 管理共享实例的工厂
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class WebSiteFactory {

    private HashMap<String, WebSite> websites = new HashMap<String, WebSite>();

    public WebSite getSharedWebsite(String key) {
        if (!websites.containsKey(key)) {
            websites.put(key, new SharedWebSite(key));
        }
        return websites.get(key);
    }

    public int getCount() {
        return websites.size();
    }
}
