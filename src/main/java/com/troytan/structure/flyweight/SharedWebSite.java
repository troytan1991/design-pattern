package com.troytan.structure.flyweight;

/**
 * 共享实例的对象，内部状态(name)不变，外部变化的状态(user)以参数形式传入
 * 
 * @author troytan
 * @date 2017年12月6日
 */
public class SharedWebSite extends WebSite {

    public SharedWebSite(String name){
        super(name);
    }

    @Override
    public void visit(User user) {
        System.out.println(String.format("用户%s访问共享网站%s", user.getName(), name));
    }

}
