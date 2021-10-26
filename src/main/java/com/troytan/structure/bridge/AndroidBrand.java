package com.troytan.structure.bridge;


/**
 * TODO description
 * @author troytan
 * @date 2017年12月4日
 */

public class AndroidBrand extends MobileBrand{

    /**
     *
     * @author troytan
     * @date 2017年12月4日
     * (non-Javadoc)
     * @see com.troytan.structure.bridge.MobileBrand#runSoftware()
     */
    	
    @Override
    public void runSoftware() {
        software.run();
    }

}
