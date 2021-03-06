/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : AdapterTest.java
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

import com.troytan.structure.adapter.Forward;
import com.troytan.structure.adapter.Guard;
import com.troytan.structure.adapter.Player;
import com.troytan.structure.adapter.Translator;

/**
 * 适配器模式：将一个类的接口转化成目标接口形式，达到兼容的目的
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class AdapterTest {

    @Test
    public void adapterTest() {
        Player forward = new Forward("麦迪");
        forward.attack();

        Player guard = new Guard("巴蒂尔");
        guard.defense();

        Player center = new Translator("姚明");
        center.attack();
        center.defense();

    }
}
