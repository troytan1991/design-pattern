/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : MysqlUser.java
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

package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class MysqlUser implements IUser {

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IUser#insert()
     */

    @Override
    public void insert() {
        System.out.println("mysql插入user");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IUser#update()
     */

    @Override
    public void update() {
        System.out.println("mysql更新user");
    }

}
