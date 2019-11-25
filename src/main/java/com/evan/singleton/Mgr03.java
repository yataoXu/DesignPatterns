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


    public static void main(String[] args) {
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
    /**
     * 39096934
     * 1637915755
     * 127935703
     * 593800070
     * 1835179342
     * 39096934
     * 1333410369
     */
}
