package com.troytan.behavior.state;

public class AfterNoonState implements State {

    @Override
    public void handle(Context context) {
        if (context.getHour() < 17) {
            System.out.println(String.format("当前时间:%.0f点,状态不错", context.getHour()));
        }else {
            context.setState(new EveningState());
            context.doWork();
        }
    }

}
