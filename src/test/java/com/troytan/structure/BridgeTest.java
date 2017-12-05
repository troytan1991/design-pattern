/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : BridgeTest.java
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

import com.troytan.structure.bridge.AddressBook;
import com.troytan.structure.bridge.AndroidBrand;
import com.troytan.structure.bridge.AppleBrand;
import com.troytan.structure.bridge.Game;
import com.troytan.structure.bridge.MobileBrand;
import com.troytan.structure.bridge.Software;

/**
 * 通过合成、集合方式，解耦品牌跟软件的关联，各自变化、组合
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class BridgeTest {

    @Test
    public void appleTest() {
        Software software = new Game();
        MobileBrand brand = new AppleBrand();
        System.out.println("------apple brand software--------");
        brand.setSoftware(software);
        brand.runSoftware();

        software = new AddressBook();
        brand.setSoftware(software);
        brand.runSoftware();
    }

    @Test
    public void androidTest() {
        Software software = new Game();
        MobileBrand brand = new AndroidBrand();
        System.out.println("--------android brand software-----");
        brand.setSoftware(software);
        brand.runSoftware();

        software = new AddressBook();
        brand.setSoftware(software);
        brand.runSoftware();
    }
}
