package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月5日
 */
public class OracleFactory implements IFactory {

    /**
     * @author troytan
     * @date 2017年12月5日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createUser()
     */
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    /**
     * @author troytan
     * @date 2017年12月5日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createDepartment()
     */
    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }

}
