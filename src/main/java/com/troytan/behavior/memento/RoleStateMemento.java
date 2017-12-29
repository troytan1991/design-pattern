package com.troytan.behavior.memento;

/**
 * Memento类:负责存储Originator的内部状态
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class RoleStateMemento {

    private Integer vitality;
    private Integer attack;
    private Integer defence;

    public RoleStateMemento(Integer vitality, Integer attack, Integer defence){
        this.vitality = vitality;
        this.attack = attack;
        this.defence = defence;
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setActack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }
}
