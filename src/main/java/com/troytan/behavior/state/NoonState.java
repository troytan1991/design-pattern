package com.troytan.behavior.state;

public class NoonState implements State {

    @Override
    public void handle(Context context) {
        if (context.getHour() < 13) {
            System.out.println(String.format("当前时间:%.0f,吃完午饭休息", context.getHour()));
        } else {
            // 转移下一状态处理
            context.setState(new AfterNoonState());
            context.doWork();
        }
    }

}
