package com.troytan.structure.decorator;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Shoes extends Finery {

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.decorator.Finery#show()
     */
    @Override
    public void show() {
        System.out.println("鞋子");
        super.show();
    }
}
