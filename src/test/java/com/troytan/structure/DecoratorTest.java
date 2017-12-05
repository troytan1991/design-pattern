/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : DecoratorTest.java
*
* @Author : s8xriw
*
* @Date : 2017年12月4日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2017年12月4日    s8xriw    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.decorator.Finery;
import com.troytan.structure.decorator.Pants;
import com.troytan.structure.decorator.Person;
import com.troytan.structure.decorator.Shoes;
import com.troytan.structure.decorator.TShirts;

/**
 * TODO description
 * 
 * @author s8xriw
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
