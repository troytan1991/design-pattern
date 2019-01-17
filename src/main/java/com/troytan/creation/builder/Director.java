package com.troytan.creation.builder;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class Director {

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     */
    private PersonBuilder pBuilder;

    public Director(PersonBuilder pBuilder){
        this.pBuilder = pBuilder;
    }

    public void createPerson() {
        pBuilder.buildArm();
        pBuilder.buildBody();
        pBuilder.buildHead();
        pBuilder.buildLeg();
    }
}
