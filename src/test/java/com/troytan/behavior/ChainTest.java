package com.troytan.behavior;

import org.junit.Test;

import com.troytan.behavior.chain.CommonManager;
import com.troytan.behavior.chain.DirectorManager;
import com.troytan.behavior.chain.Manager;
import com.troytan.behavior.chain.Request;
import com.troytan.behavior.chain.SeniorManager;

/**
 * 责任链模式：将多个处理请求的对象以链式结合在一起，并沿着该链处理请求，直到找到正确的处理者截至
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class ChainTest {

    @Test
    public void chainTest() {
        Manager comManager = new CommonManager();
        Manager senManager = new SeniorManager();
        Manager dirManager = new DirectorManager();

        // 构建链式关系
        comManager.setSuperior(senManager);
        senManager.setSuperior(dirManager);

        comManager.handleRequest(new Request("请假", 1));
        comManager.handleRequest(new Request("请假", 5));
        comManager.handleRequest(new Request("加薪", 500));
        comManager.handleRequest(new Request("加薪", 5000));
    }
}
