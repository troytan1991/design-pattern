package com.troytan.behavior.interpreter;

/**
 * 音阶翻译器
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class ScaleExpression extends AbstractExpression {

    @Override
    public void execute(String playKey, float playValue) {
        String scale = "";
        switch (((Float) playValue).intValue()) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                break;
        }
        System.out.println(scale);
    }

}
