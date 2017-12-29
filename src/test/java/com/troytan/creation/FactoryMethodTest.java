
package com.troytan.creation;

import org.junit.Assert;
import org.junit.Test;

import com.troytan.creation.factorymethod.AddFactory;
import com.troytan.creation.factorymethod.IFactory;
import com.troytan.creation.factorymethod.MulFactory;
import com.troytan.creation.factorymethod.Operation;

/**
 * 工厂方法：定义一个创建对象的接口，让子类决定具体的创建过程。使得一个类的实例化延迟到子类
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class FactoryMethodTest {

    @Test
    public void addTest() {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setA(1.0);
        operation.setB(1.0);
        Assert.assertTrue(operation.getResult() == operation.getA() + operation.getB());
    }

    @Test
    public void mulTest() {
        IFactory factory = new MulFactory();
        Operation operation = factory.createOperation();
        operation.setA(1.0);
        operation.setB(1.0);
        Assert.assertTrue(operation.getResult() == operation.getA() * operation.getB());
    }
}
