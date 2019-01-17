package com.troytan.stream;

public class CompoKey {

    public CompoKey(String compo_key1, Integer compo_key2){
        this.compo_key1 = compo_key1;
        this.compo_key2 = compo_key2;
    }

    private String  compo_key1;
    private Integer compo_key2;

    public CompoKey(){
        // TODO Auto-generated constructor stub
    }

    public String getCompo_key1() {
        return compo_key1;
    }

    public void setCompo_key1(String compo_key1) {
        this.compo_key1 = compo_key1;
    }

    public Integer getCompo_key2() {
        return compo_key2;
    }

    public void setCompo_key2(Integer compo_key2) {
        this.compo_key2 = compo_key2;
    }

    @Override
    public boolean equals(Object obj) {
        CompoKey o = (CompoKey) obj;

        return this.compo_key1.equals(o.compo_key1) && this.compo_key2.equals(o.compo_key2);
    }

    @Override
    public int hashCode() {

        return compo_key2;
    }

}
