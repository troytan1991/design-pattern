/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : AbstractFactoryTest.java
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

import com.troytan.creation.abstractfactory.IDepartment;
import com.troytan.creation.abstractfactory.IFactory;
import com.troytan.creation.abstractfactory.IUser;
import com.troytan.creation.abstractfactory.MysqlFactory;
import com.troytan.creation.abstractfactory.OracleFactory;

/**
 * TODO description
 * @author s8xriw
 * @date 2017年12月4日
 */

public class AbstractFactoryTest {
    
    @Test
    public void oracleTest() {
        IFactory factory = new OracleFactory();
        System.out.println("-------------oracle factory----------");
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
        user.insert();
        user.update();
        department.insert();
        department.update();
    }
    @Test
    public void mysqlTest() {
        IFactory factory = new MysqlFactory();
        System.out.println("-------------mysql factory----------");
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
        user.insert();
        user.update();
        department.insert();
        department.update();
    }
}
