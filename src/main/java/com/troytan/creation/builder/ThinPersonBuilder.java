package com.troytan.creation.builder;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class ThinPersonBuilder implements PersonBuilder {

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildHead()
     */

    @Override
    public void buildHead() {
        System.out.println("build thin head");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildBody()
     */

    @Override
    public void buildBody() {
        System.out.println("build thin body");

    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildArm()
     */

    @Override
    public void buildArm() {
        System.out.println("build thin arm");
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.builder.PersonBuilder#buildLeg()
     */

    @Override
    public void buildLeg() {
        System.out.println("build thin leg");
    }

}
