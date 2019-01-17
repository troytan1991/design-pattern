package com.troytan.creation.prototype;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class Student extends Person implements Cloneable{

    private String  school;
    private Teacher teacher;

    /**
     * deep clone
     * 
     * @author s8xriw
     * @date 2017年12月4日
     * @return
     * @throws CloneNotSupportedException (non-Javadoc)
     * @see java.lang.Object#clone()
     */

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student deepClone = (Student) super.clone();
        deepClone.setTeacher((Teacher) teacher.clone());
        return deepClone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student [school=" + school + ", teacher=" + teacher + ", age=" + getAge() + ", name="
               + getName() + ", gender=" + getGender() + "]";
    }
}
