package com.evan.singleton;

import org.junit.Test;

/**
 * @Description
 * @ClassName TestSingleton
 * @Author Evan
 * @date 2019.11.27 22:07
 */
public class TestSingleton {

    @Test
    public void testMgr03() {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr03.getInstance().hashCode());
                    }
            ).start();
        }
    }

    // 线程A getInstance()  发现没有实例于是执行Instance = new Mgr03();转载资源ing
    // 线程B getInstance()  发现没有实例于是执行Instance = new Mgr03();
    // 这个时候内存中就会有两个不同的实例


    @Test
    public void testMgr04() {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr04.getInstance().hashCode());
                    }
            ).start();
        }
    }

    @Test
    public void testMgr05() {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr05.getInstance().hashCode());
                    }
            ).start();
        }
    }
}

