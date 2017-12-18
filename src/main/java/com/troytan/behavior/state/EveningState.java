package com.troytan.behavior.state;

public class EveningState implements State {

    @Override
    public void handle(Context context) {
        System.out.println(String.format("当前时间:%.0f点,很累不想加班", context.getHour()));
    }
}
