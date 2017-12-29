package com.troytan.behavior.memento;

/**
 * Caretaker类:负责管理好memento对象
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

}
