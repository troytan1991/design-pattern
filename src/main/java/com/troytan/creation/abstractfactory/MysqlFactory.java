package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class MysqlFactory implements IFactory {

    /**
     * @author s8xriw
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createUser()
     */

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    /**
     * @author s8xriw
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createDepartment()
     */

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }

}
