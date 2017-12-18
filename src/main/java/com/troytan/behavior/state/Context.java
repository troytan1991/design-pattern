package com.troytan.behavior.state;

/**
 * 上下文类，存储当前状态信息
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class Context {

    private State state; // 当前状态
    private Float hour;  // 时间点

    public Context(){
        this.state = new ForenoonState(); // 初始化状态
    }

    public void doWork() {
        state.handle(this);
    }

    public void request() {
        state.handle(this);
    }

    public Float getHour() {
        return hour;
    }

    public void setHour(Float hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
