package com.troytan.structure.bridge;

/**
 * TODO description
 * 
 * @author troytan
 * @date 2017年12月4日
 */

public class Game implements Software {

    /**
     * @author troytan
     * @date 2017年12月4日 (non-Javadoc)
     * @see com.troytan.structure.bridge.Software#run()
     */
    @Override
    public void run() {
        System.out.println("运行游戏");
    }

}
