package com.troytan.behavior.memento;

/**
 * Originator类:发起人,负责创建以及恢复备忘录
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class RoleStateOriginator {

    private Integer vitality;
    private Integer attack;
    private Integer defence;

    /**
     * 存储状态
     *
     * @author troytan
     * @date 2017年12月29日
     * @return
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defence);
    }

    /**
     * 恢复状态
     *
     * @author troytan
     * @date 2017年12月29日
     * @param memento
     */
    public void recoverState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defence = memento.getDefence();
    }

    @Override
    public String toString() {
        return "RoleStateOriginator [vitality=" + vitality + ", attack=" + attack + ", defence=" + defence + "]";
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

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }
}
