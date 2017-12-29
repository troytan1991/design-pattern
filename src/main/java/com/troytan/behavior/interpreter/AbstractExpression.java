package com.troytan.behavior.interpreter;

import org.apache.commons.lang3.StringUtils;

/**
 * 抽象表达式类
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public abstract class AbstractExpression {

    public void interpret(PlayContext context) {
        // 执行common的解析操作
        String noteText = context.getNoteText();
        if (StringUtils.isBlank(noteText)) {
            return;
        }
        // 截取第一个字符
        String playKey = noteText.substring(0, 1);
        noteText = noteText.substring(2);

        float playValue = Float.parseFloat(noteText.substring(0, noteText.indexOf(" ")));
        context.setNoteText(noteText.substring(noteText.indexOf(" ") + 1));

        // 执行差异的解析操作:延迟到子类翻译
        execute(playKey, playValue);
    }

    public abstract void execute(String playKey, float playValue);
}
