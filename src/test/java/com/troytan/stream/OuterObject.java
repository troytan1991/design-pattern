package com.troytan.stream;

public class OuterObject {

    private Integer col1;
    private String  col2;
    private Double  col3;

    private String  compo_key1;
    private Integer compo_key2;

    public Integer getCol1() {
        return col1;
    }

    public void setCol1(Integer col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public Double getCol3() {
        return col3;
    }

    public void setCol3(Double col3) {
        this.col3 = col3;
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

    public CompoKey getCompoKey() {
        return new CompoKey(this.compo_key1, this.compo_key2);
    }

}
