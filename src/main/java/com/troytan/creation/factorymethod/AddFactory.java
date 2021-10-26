package com.troytan.creation.factorymethod;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class AddFactory implements IFactory {

    /**
     * @author troytan
     * @date 2017年12月4日
     * @param operationStr
     * @return (non-Javadoc)
     * @see com.troytan.creation.factorymethod.IFactory#createOperation(java.lang.String)
     */

    @Override
    public Operation createOperation() {
        return new AddOperation();
    }

}
