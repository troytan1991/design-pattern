package com.troytan.creation.Singleton;

/**
 * TODO description
 * 
 * @author s8xriw
 * @date 2017年12月4日
 */

public class DbManager {

    private static DbManager instance;
    private static Object     syncRoot = new Object(); // 多线程锁定的辅助对象

    // 私有化构造方法
    private DbManager(){

    }

    /**
     * 多线程下的单例实现
     *
     * @author s8xriw
     * @date 2017年12月4日
     * @return
     */
    public static DbManager getInstance() {
        if (instance == null) {
            synchronized (syncRoot) {
                if (instance == null) { // 双重锁定，避免两个线程同时通过第一层判断时，造成多实例化
                    instance = new DbManager();
                }
            }
        }
        return instance;
    }
}
