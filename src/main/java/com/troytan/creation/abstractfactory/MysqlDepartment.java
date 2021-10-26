package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class MysqlDepartment implements IDepartment {

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IDepartment#insert()
     */
    @Override
    public void insert() {
        System.out.println("mysql插入department");
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IDepartment#update()
     */
    @Override
    public void update() {
        System.out.println("mysql更新department");
    }

}
