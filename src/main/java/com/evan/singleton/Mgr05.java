package com.evan.singleton;

/**
 * @Description
 * @ClassName Mgr05
 * @Author Evan
 * @date 2019.11.24 11:41
 */
public class Mgr05 {
    private static volatile Mgr05 Instance;

    private Mgr05() {
    }

    public static synchronized Mgr05 getInstance() {

        if (Instance == null) {
            // 通过减小同步代码块的方式提高效率，其实是不可行的
            // 线程A getInstance()  发现没有实例于是执行Instance = new Mgr03();
            // 线程B getInstance()  发现没有实例于是执行Instance = new Mgr03(); 线程B得到synchronized (Mgr05.class) {}代码块的锁且实例化
            // 线程B 释放锁后，线程A 得到锁且继续执行
            // 这个时候内存中就会有两个不同的实例
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Instance = new Mgr05();
            }
        }

        return Instance;
    }


}

