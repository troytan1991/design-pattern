package com.troytan.structure.flyweight;

/**
 * 不共享的网站对象
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class UnsharedWebsite extends WebSite {

    public UnsharedWebsite(String name){
        super(name);
    }

    @Override
    public void visit(User user) {
        System.out.println(String.format("用户:%s访问不共享网站:%s", user.getName(), name));
    }

}
