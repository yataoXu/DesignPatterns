package com.evan.singleton;

/**
 * @Description lazy loading
 * 虽然达到了目的，但是带来了线程问题
 * @ClassName Mgr03
 * @Author Evan
 * @date 2019.11.24 11:20
 */
public class Mgr03 {
    private static Mgr03 Instance;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {

        if (Instance == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Instance = new Mgr03();
        }
        return Instance;
    }
}


