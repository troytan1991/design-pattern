package com.troytan.behavior.interpreter;

/**
 * 音符翻译器
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class NoteExpression extends AbstractExpression {

    @Override
    public void execute(String playKey, float playValue) {
        String note = "";
        switch (playKey) {
            case "C":
                note = "do";
                break;
            case "D":
                note = "re";
                break;
            case "E":
                note = "me";
                break;
            case "F":
                note = "fa";
                break;
            case "G":
                note = "so";
                break;
            case "H":
                note = "la";
                break;
            case "I":
                note = "xi";
                break;
            default:
                break;
        }
        System.out.println(String.format("%s-%.1f", note, playValue));
    }

}
