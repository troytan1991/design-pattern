package com.troytan.behavior.observer;

/**
 * 具体观察者
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class ConcreateObserver implements Observer {

    private String name;

    public ConcreateObserver(String name, Subject subject){
        this.name = name;
        subject.attach(this);
    }

    @Override
    public void update(float temprature) {
        System.out.println(String.format("%s更新温度为%.2f℃", name, temprature));
    }

}
