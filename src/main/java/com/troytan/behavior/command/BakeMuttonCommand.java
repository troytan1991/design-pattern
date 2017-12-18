package com.troytan.behavior.command;

/**
 * ConcreateCommand，具体命令类
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class BakeMuttonCommand implements Command {

    private Barbecuer barbecuer;

    public BakeMuttonCommand(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }

}
