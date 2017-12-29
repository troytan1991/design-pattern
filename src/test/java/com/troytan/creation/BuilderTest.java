
package com.troytan.creation;

import org.junit.Test;

import com.troytan.creation.builder.Director;
import com.troytan.creation.builder.FatPersonBuilder;
import com.troytan.creation.builder.PersonBuilder;
import com.troytan.creation.builder.ThinPersonBuilder;

/**
 * 建造者模式：将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class BuilderTest {

    @Test
    public void thinBuilerTest() {
        PersonBuilder pBuilder = new ThinPersonBuilder();
        Director director = new Director(pBuilder);
        System.out.println("--------thin builder---------");
        director.createPerson();
    }

    @Test
    public void fatBuilerTest() {
        PersonBuilder pBuilder = new FatPersonBuilder();
        Director director = new Director(pBuilder);
        System.out.println("--------fat builder---------");
        director.createPerson();
    }
}
