/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : Player.java
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

package com.troytan.structure.adapter;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public abstract class Player {

    protected String name;

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     */
    public Player(String name){
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
