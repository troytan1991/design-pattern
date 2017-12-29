package com.troytan.behavior.chain;

public class Request {

    private String  type;   // 请求类别
    private Integer number; // 请求数量

    public Request(String type, Integer number){
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
