package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.observer.ConcreateObserver;
import com.troytan.behavior.observer.ConcreateSubject;
import com.troytan.behavior.observer.Observer;

/**
 * 观察者模式：订阅-通知
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class ObserverTest {

    @Test
    public void observerTest() {

        ConcreateSubject subject = new ConcreateSubject();
        // 创建观察者，并注册到subject
        Observer observer1 = new ConcreateObserver("观察者1号", subject);
        Observer observer2 = new ConcreateObserver("观察者2号", subject);
        subject.setTemprature(6f);

        // 移除观察者2号
        subject.remove(observer2);
        subject.setTemprature(5f);

    }
}
