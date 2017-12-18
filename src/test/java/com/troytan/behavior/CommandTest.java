package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.command.BakeMuttonCommand;
import com.troytan.behavior.command.BakeWingCommand;
import com.troytan.behavior.command.Barbecuer;
import com.troytan.behavior.command.Command;
import com.troytan.behavior.command.Waiter;

/**
 * 将请求封装为一个命令对象，对不同的客户请求进行参数化(不同请求对应不同的实现类);进行请求排队，记录日志，撤销等操作
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class CommandTest {

    @Test
    public void commandTest() {
        Barbecuer barbecuer = new Barbecuer();

        Command muttonCommand = new BakeMuttonCommand(barbecuer);
        Command windCommand = new BakeWingCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.addOrder(muttonCommand);
        waiter.addOrder(windCommand);
        waiter.addOrder(muttonCommand);
        waiter.cancelOrder(muttonCommand);

        System.out.println("-----实际执行情况------");
        waiter.commitCommand();
    }
}
