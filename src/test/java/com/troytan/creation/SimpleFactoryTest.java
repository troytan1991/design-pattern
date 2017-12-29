package com.troytan.creation;

import org.junit.Assert;
import org.junit.Test;

import com.troytan.creation.simplefactory.Operation;
import com.troytan.creation.simplefactory.OperationFactory;

/**
 * 简单工厂：将具体对象的创建过程封装到工厂类中进行，由工厂类控制其生命周期
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */
public class SimpleFactoryTest {

    @Test
    public void addTest() {
        Operation operation = OperationFactory.createOperation("+");
        operation.setA(1.0);
        operation.setB(1.0);
        Assert.assertTrue(operation.getResult() == operation.getA() + operation.getB());
    }

    @Test
    public void mulTest() {
        Operation operation = OperationFactory.createOperation("*");
        operation.setA(1.0);
        operation.setB(1.0);
        Assert.assertTrue(operation.getResult() == operation.getA() * operation.getB());
    }

}
