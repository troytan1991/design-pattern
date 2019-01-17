package com.troytan.creation.simplefactory;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class SubOperation extends Operation {

    /**
     * @author s8xriw
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.simplefactory.Operation#getResult()
     */

    @Override
    public double getResult() {
        return getA() - getB();
    }

}
