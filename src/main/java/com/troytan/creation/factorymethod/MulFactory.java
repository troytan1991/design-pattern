package com.troytan.creation.factorymethod;


/**
 * TODO description
 * @author s8xriw
 * @date 2017年12月4日
 */

public class MulFactory implements IFactory{

    /**
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @param operationStr
     * @return
     * (non-Javadoc)
     * @see com.troytan.creation.factorymethod.IFactory#createOperation(java.lang.String)
     */
    	
    @Override
    public Operation createOperation() {
        return new MulOperation();
    }

}
