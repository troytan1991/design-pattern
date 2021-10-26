package com.troytan.creation.prototype;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Teacher extends Person implements Cloneable{

    private Integer workYear;

    /**
     * simple clone
     * 
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

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    @Override
    public String toString() {
        return "Teacher [workYear=" + workYear + ", age=" + getAge() + ", name=" + getName()
               + ", gender=" + getGender() + "]";
    }
}
