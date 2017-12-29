package com.troytan.behavior.visitor;

/**
 * 具体的访问者:成功状态
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class Success implements Visitor {

    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人成功时，背后有个成功的女人");
    }

    @Override
    public void getWowanConclusion(Woman woman) {
        System.out.println("女人成功时，背后有个堕落的男人");
    }

}
