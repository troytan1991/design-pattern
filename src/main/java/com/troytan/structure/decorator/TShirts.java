package com.troytan.structure.decorator;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class TShirts extends Finery {

    private String color;

    /**
     * TODO description
     *
     * @author troytan
     * @date 2017年12月4日
     */
    public TShirts(String color){
        this.color = color;
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.decorator.Finery#show()
     */

    @Override
    public void show() {
        System.out.println(color + "T恤");
        super.show();
    }
}
