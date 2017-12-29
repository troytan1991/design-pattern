package com.troytan.behavior.mediator;

/**
 * 具体mediator:联合国安理会
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class UNSecurityCouncil implements UnitedNations {

    private Country china;
    private Country usa;

    @Override
    public void declare(String msg, Country colleague) {
        if (colleague instanceof China) {
            usa.notify(msg);
        } else {
            china.notify(msg);
        }
    }

    public Country getChina() {
        return china;
    }

    public void setChina(Country china) {
        this.china = china;
    }

    public Country getUsa() {
        return usa;
    }

    public void setUsa(Country usa) {
        this.usa = usa;
    }

}
