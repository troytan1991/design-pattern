/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : FatPersonBuilder.java
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

package com.troytan.creation.builder;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class FatPersonBuilder implements PersonBuilder {

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildHead()
     */

    @Override
    public void buildHead() {
        System.out.println("build fat head");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildBody()
     */

    @Override
    public void buildBody() {
        System.out.println("build fat body");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildArm()
     */

    @Override
    public void buildArm() {
        System.out.println("build fat arm");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildLeg()
     */

    @Override
    public void buildLeg() {
        System.out.println("build fat leg");
    }

}
