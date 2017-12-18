package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.templatemethod.Paper;
import com.troytan.behavior.templatemethod.PaperA;
import com.troytan.behavior.templatemethod.PaperB;

/**
 * 模版方法：父类定义算法骨架，子类实现具体步骤。
 * 
 * @author troytan
 * @date 2017年12月13日
 */
public class TemplateMethodTest {

    @Test
    public void methodTest() {
        Paper paperA = new PaperA("学生1");
        Paper paperB = new PaperB("学生2");

        paperA.testQuestion1();
        paperA.testQuestion2();
        System.out.println("---------------------------");
        paperB.testQuestion1();
        paperB.testQuestion2();
    }
}
