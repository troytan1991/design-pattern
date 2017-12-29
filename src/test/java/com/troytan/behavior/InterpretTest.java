package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.interpreter.AbstractExpression;
import com.troytan.behavior.interpreter.NoteExpression;
import com.troytan.behavior.interpreter.PlayContext;
import com.troytan.behavior.interpreter.ScaleExpression;

/**
 * 解释器模式
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class InterpretTest {

    @Test
    public void interpretTest() {
        AbstractExpression expression = null;

        PlayContext context = new PlayContext();
        context.setNoteText("O 2 D 1.0  F 0.5 G 0.25 C 3 D 2");
        while (!context.getNoteText().isEmpty()) {
            String first = context.getNoteText().substring(0, 1);
            if (first.equals("O")) {
                expression = new ScaleExpression();
            } else {
                expression = new NoteExpression();
            }
            expression.interpret(context);
        }
    }
}
