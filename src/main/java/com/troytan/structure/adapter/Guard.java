/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : Forward.java
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

public class Guard extends Player {

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @param name
     */
    public Guard(String name){
        super(name);
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#attack()
     */

    @Override
    public void attack() {
        System.out.println(String.format("后卫%s进攻", name));
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#defense()
     */

    @Override
    public void defense() {
        System.out.println(String.format("后卫%s防守", name));
    }

}
