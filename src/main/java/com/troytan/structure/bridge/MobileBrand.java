package com.troytan.structure.bridge;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public abstract class MobileBrand {

    protected Software software;

    /**
     * TODO description
     *
     * @author s8xriw
     * @date 2017年12月4日
     */
    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void runSoftware();
}
