/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : SingletonTest.java
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

import org.junit.Assert;
import org.junit.Test;

import com.troytan.creation.Singleton.DbManager;

/**
 * TODO description
 * 
 * @author s8xriw
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
