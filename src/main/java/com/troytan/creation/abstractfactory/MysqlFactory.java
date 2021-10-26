package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class MysqlFactory implements IFactory {

    /**
     * @author troytan
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createUser()
     */

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    /**
     * @author troytan
     * @date 2017年12月4日
     * @return (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IFactory#createDepartment()
     */

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }

}
