/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : BuilderTest.java
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
	
package com.troytan.creation;

import org.junit.Test;

import com.troytan.creation.builder.Director;
import com.troytan.creation.builder.FatPersonBuilder;
import com.troytan.creation.builder.PersonBuilder;
import com.troytan.creation.builder.ThinPersonBuilder;

/**
 * TODO description
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
