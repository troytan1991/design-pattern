package com.troytan.behavior.chain;

/**
 * 具体操作者：总监
 * 
 * @author troytan
 * @date 2017年12月18日
 */
public class DirectorManager extends Manager {

    @Override
    public void handleRequest(Request request) {

        if (request.getType().equals("加薪")) {
            if (request.getNumber() < 1000) {
                System.out.println(String.format("%s%d元被总监批准", request.getType(), request.getNumber()));
            } else {
                System.out.println(String.format("%s%d元被总监拒绝", request.getType(), request.getNumber()));
            }
        } else {
            System.out.println("请求不合法");
        }
    }

}
