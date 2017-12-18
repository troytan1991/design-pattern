package com.troytan.behavior.command;

public class BakeWingCommand implements Command {

    private Barbecuer barbecuer;

    public BakeWingCommand(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeWing();
    }

    @Override
    public String toString() {
        return "烤羊肉串";
    }

}
