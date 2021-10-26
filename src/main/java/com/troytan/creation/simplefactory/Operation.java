package com.troytan.creation.simplefactory;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public abstract class Operation {

    private Double a;
    private Double b;

    public abstract double getResult();

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

}
