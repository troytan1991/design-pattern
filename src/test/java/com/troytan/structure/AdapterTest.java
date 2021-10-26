package com.troytan.structure;

import org.junit.Test;

import com.troytan.structure.adapter.Forward;
import com.troytan.structure.adapter.Guard;
import com.troytan.structure.adapter.Player;
import com.troytan.structure.adapter.Translator;

/**
 * 适配器模式：将一个类的接口转化成目标接口形式，达到兼容的目的
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class AdapterTest {

    @Test
    public void adapterTest() {
        Player forward = new Forward("麦迪");
        forward.attack();

        Player guard = new Guard("巴蒂尔");
        guard.defense();

        Player center = new Translator("姚明");
        center.attack();
        center.defense();

    }
}
