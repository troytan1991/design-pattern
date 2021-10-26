package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */
public class MysqlUser implements IUser {

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IUser#insert()
     */

    @Override
    public void insert() {
        System.out.println("mysql插入user");
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IUser#update()
     */

    @Override
    public void update() {
        System.out.println("mysql更新user");
    }

}
