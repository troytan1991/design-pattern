package com.troytan.behavior.chain;

/**
 * 具体处理者：经理
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class CommonManager extends Manager {

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("请假") && request.getNumber() <= 3) {
            System.out.println(String.format("%s%d天被经理批准", request.getType(), request.getNumber()));
        } else {
            // 无权限交由上级处理
            if (superior != null) {
                superior.handleRequest(request);
            }
        }
    }

}
