package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class OracleDepartment implements IDepartment {

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IDepartment#insert()
     */

    @Override
    public void insert() {
        System.out.println("oracle插入department");
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.creation.abstractfactory.IDepartment#update()
     */

    @Override
    public void update() {
        System.out.println("oracle更新department");
    }

}
