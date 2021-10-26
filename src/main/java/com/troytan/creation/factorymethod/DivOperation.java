package com.troytan.creation.factorymethod;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class DivOperation extends Operation {

    /**
     * @author troytan
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.simplefactory.Operation#getResult()
     */

    @Override
    public double getResult() {
        return getA() / getB();
    }

}
