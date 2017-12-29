package com.troytan.behavior.mediator;

/**
 * 具体colleague类：中国
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class USA extends Country {

    public USA(UnitedNations mediator){
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.declare(msg, this);
    }

    @Override
    public void notify(String msg) {
        System.out.println("美国收到消息:" + msg);
    }

}
