package com.troytan.structure.adapter;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Translator extends Player {

    private ChineseCenter chineseCenter = new ChineseCenter();

    /**
     * TODO description
     *
     * @author troytan
     * @date 2017年12月4日
     * @param name
     */
    public Translator(String name){
        super(name);
        chineseCenter.setName(name);
    }

    /**
     * TODO description
     *
     * @author troytan
     * @date 2017年12月4日
     * @param name
     */

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#attack()
     */

    @Override
    public void attack() {
        chineseCenter.jingong();
    }

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.adapter.Player#defense()
     */

    @Override
    public void defense() {
        chineseCenter.fangshou();
    }

}
