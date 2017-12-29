package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.memento.RoleStateCaretaker;
import com.troytan.behavior.memento.RoleStateOriginator;

/**
 * 备忘录模式:不破坏封装性的前提下，捕获一个对象的内部状态，并在改对象之外保存这个状态。后续可根据该对象进行状态恢复。
 * 
 * @author troytan
 * @date 2017年12月29日
 */
public class MementoTest {

    @Test
    public void mementoTest() {
        RoleStateOriginator originator = new RoleStateOriginator();
        originator.setAttack(30);
        originator.setDefence(50);
        originator.setVitality(100);
        System.out.println("战斗前:" + originator);

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(originator.saveState());

        originator.setAttack(0);
        originator.setDefence(0);
        originator.setVitality(0);
        System.out.println("战斗后:" + originator);

        originator.recoverState(caretaker.getMemento());
        System.out.println("恢复状态:" + originator);

    }
}
