/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : Translator.java
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

public class Translator extends Player {

    private ChineseCenter chineseCenter = new ChineseCenter();

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @param name
     */
    public Translator(String name){
        super(name);
        chineseCenter.setName(name);
    }

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @param name
     */

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#attack()
     */

    @Override
    public void attack() {
        chineseCenter.jingong();
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#defense()
     */

    @Override
    public void defense() {
        chineseCenter.fangshou();
    }

}
