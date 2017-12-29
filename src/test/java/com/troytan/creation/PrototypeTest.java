/*
* Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
*
* This software is published under the terms of the SGM Software
* License version 1.0, a copy of which has been included with this
* distribution in the LICENSE.txt file.
*
* @Project Name : design-pattern
*
* @File name : PrototypeTest.java
*
* @Author : s8xriw
*
* @Date : 2017年12月4日
*
----------------------------------------------------------------------------------
*     Date       Who       Version     Comments
* 1. 2017年12月4日    s8xriw    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/

package com.troytan.creation;

import org.junit.Assert;
import org.junit.Test;

import com.troytan.creation.prototype.SimpleStudent;
import com.troytan.creation.prototype.Student;
import com.troytan.creation.prototype.Teacher;

/**
 * 原型模式：用原型实例指定创建创建对象的种类，并通过copy原型创建新的对象.使用clone方式创建同样新的对象，提交创建效率
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class PrototypeTest {

    /**
     * 深copy,引用属性类型不共用
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @throws CloneNotSupportedException
     */
    @Test
    public void deepCloneTest() throws CloneNotSupportedException {
        Student student = new Student();
        Teacher teacher = new Teacher();
        teacher.setAge(50);
        teacher.setWorkYear(25);
        teacher.setGender("male");
        teacher.setName("teacher yang");

        student.setAge(16);
        student.setGender("female");
        student.setName("alice");
        student.setSchool("changjiang");
        student.setTeacher(teacher);

        Student deepClone = (Student) student.clone();
        // 不共用teacher对象
        teacher.setAge(51);

        Assert.assertFalse(deepClone.getTeacher().getAge().equals(teacher.getAge()));
        System.out.println("prototype:" + student);
        System.out.println("deepClone:" + deepClone);
    }

    /**
     * 浅copy, 引用属性共用对象
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @throws CloneNotSupportedException
     */
    @Test
    public void simpleCloneTest() throws CloneNotSupportedException {
        SimpleStudent student = new SimpleStudent();
        Teacher teacher = new Teacher();
        teacher.setAge(50);
        teacher.setWorkYear(25);
        teacher.setGender("male");
        teacher.setName("teacher yang");

        student.setAge(16);
        student.setGender("female");
        student.setName("alice");
        student.setSchool("changjiang");
        student.setTeacher(teacher);

        SimpleStudent simpleClone = (SimpleStudent) student.clone();
        // 共用teacher对象
        teacher.setAge(51);

        Assert.assertTrue(simpleClone.getTeacher().getAge().equals(teacher.getAge()));
        System.out.println("prototype:" + student);
        System.out.println("simpleClone:" + simpleClone);
    }
}
