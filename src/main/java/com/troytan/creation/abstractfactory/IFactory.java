package com.troytan.creation.abstractfactory;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
