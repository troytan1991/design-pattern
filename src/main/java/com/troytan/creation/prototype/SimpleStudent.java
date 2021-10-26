package com.troytan.creation.prototype;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class SimpleStudent extends Person implements Cloneable {

    private String  school;
    private Teacher teacher;

    @Override
    public String toString() {
        return "SimpleStudent [school=" + school + ", teacher=" + teacher + ", age=" + getAge() + ", name="
               + getName() + ", gender=" + getGender() + "]";
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

    /**
     * @author troytan
     * @date 2017年12月4日
     * @return
     * @throws CloneNotSupportedException (non-Javadoc)
     * @see java.lang.Object#clone()
     */

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
