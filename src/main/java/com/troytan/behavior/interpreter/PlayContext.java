package com.troytan.behavior.interpreter;

/**
 * Context类，待翻译的上下文
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class PlayContext {

    // 原始音符串，如: O 3 E 0.5 G 1 A 3
    private String noteText;

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        // format格式后存入，严格控制只有一个空格
        this.noteText = noteText.trim().replaceAll("\\s+", " ") + " ";
    }

}
