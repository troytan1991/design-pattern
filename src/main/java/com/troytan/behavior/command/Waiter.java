package com.troytan.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker类，对接用户请求，调用command服务。 服务员对命令操作，而不直接对具体烧烤师
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class Waiter {

    private List<Command> commands = new ArrayList<>();

    /**
     * 添加订单
     *
     * @author troytan
     * @date 2017年12月13日
     * @param command
     */
    public void addOrder(Command command) {
        // 鉴定是否有效
        if (command instanceof BakeWingCommand) {
            System.out.println("烤鸡翅没有了，请点其它烧烤");
        } else {
            commands.add(command);
            System.out.println("添加订单" + command);
        }
    }

    /**
     * 取消订单
     *
     * @author troytan
     * @date 2017年12月13日
     * @param command
     */
    public void cancelOrder(Command command) {
        commands.remove(command);
        System.out.println("移除订单" + command);
    }

    /**
     * 通知执行订单
     *
     * @author troytan
     * @date 2017年12月13日
     */
    public void commitCommand() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
