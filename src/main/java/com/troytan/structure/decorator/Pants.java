package com.troytan.structure.decorator;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Pants extends Finery {

    private String style; // 附加属性

    /**
     * TODO description
     *
     * @author troytan
     * @date 2017年12月4日
     */
    public Pants(String style){
        this.style = style;
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.decorator.Finery#show()
     */

    @Override
    public void show() {
        System.out.println(style + "裤子"); // 附加特性操作
        super.show();
    }

}
