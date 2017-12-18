package com.troytan.behavior.state;

/**
 * 具体状态类，上午状态 TODO description
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class ForenoonState implements State {

    @Override
    public void handle(Context context) {
        if (context.getHour() < 12) {
            System.out.println(String.format("当前时间:%.0f点,精力充沛", context.getHour()));
        } else {
            // 状态转移下一状态
            context.setState(new NoonState());
            context.doWork();
        }
    }

}
