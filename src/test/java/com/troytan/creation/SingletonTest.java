package com.troytan.creation;

import org.junit.Assert;
import org.junit.Test;

import com.troytan.creation.Singleton.DbManager;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点(getInstance方法)
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class SingletonTest {

    @Test
    public void singletonTest() {
        DbManager instance1 = DbManager.getInstance();
        DbManager instance2 = DbManager.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }
}
