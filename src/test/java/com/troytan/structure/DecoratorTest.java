package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.decorator.Finery;
import com.troytan.structure.decorator.Pants;
import com.troytan.structure.decorator.Person;
import com.troytan.structure.decorator.Shoes;
import com.troytan.structure.decorator.TShirts;

/**
 * 装饰模式：动态的对一个对象添加额外的职能。解耦原对象与新特性的关联，相对于生成子类来说更灵活(子类包含了父类对象特性) *功能添加：组合方式>继承方式
 * 
 * @author troytan
 * @date 2017年12月4日
 */
public class DecoratorTest {

    @Test
    public void decoratorTest() {
        Person person = new Finery();

        Finery tShirts = new TShirts("白色");
        Finery pants = new Pants("长的");
        Finery shoes = new Shoes();

        tShirts.decorate(person);
        shoes.decorate(tShirts);
        pants.decorate(shoes);
        pants.show();
    }
}
