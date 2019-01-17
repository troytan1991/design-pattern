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
