package com.troytan.behavior.chain;

/**
 * 具体操作者：高级经理
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class SeniorManager extends Manager {

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("请假")) {
            System.out.println(String.format("%s%d天被高级经理批准", request.getType(), request.getNumber()));
        } else {
            if (superior != null) {
                superior.handleRequest(request);
            }
        }
    }

}
