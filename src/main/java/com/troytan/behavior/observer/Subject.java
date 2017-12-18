package com.troytan.behavior.observer;

/**
 * 通知者接口
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public interface Subject {

    void attach(Observer observer);

    void remove(Observer observer);

    void notifyObserver();
}
