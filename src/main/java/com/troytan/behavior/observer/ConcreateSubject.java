package com.troytan.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体通知者
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class ConcreateSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private Float          temprature;

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temprature);
        }
    }

    public Float getTemprature() {
        return temprature;
    }

    public void setTemprature(Float temprature) {
        this.temprature = temprature;
        notifyObserver();
    }

}
