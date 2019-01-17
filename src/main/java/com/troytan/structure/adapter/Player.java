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
