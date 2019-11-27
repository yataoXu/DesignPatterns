package com.evan.singleton;

/**
 * @Description lazy loading
 * 虽然达到了目的，但是带来了线程问题
 * 可以通过synchronized 解决，但是性能也会下降
 * @Author Evan
 * @date 2019.11.24 11:37
 */
public class Mgr04 {
    private static Mgr04 Instance;

    private Mgr04() {
    }

    public static synchronized Mgr04 getInstance() {

        if (Instance == null) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Instance = new Mgr04();
        }
        return Instance;
    }
}
