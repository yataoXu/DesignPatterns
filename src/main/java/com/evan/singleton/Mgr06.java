package com.evan.singleton;

/**
 * @Description
 * @ClassName Mgr06
 * @Author Evan
 * @date 2019.11.24 11:50
 */
public class Mgr06 {

    private static volatile Mgr06 Instance;

    private Mgr06() {
    }

    public static synchronized Mgr06 getInstance() {

        if (Instance == null) {

            // 双重检查
            synchronized (Mgr06.class) {
                if (Instance == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Instance = new Mgr06();
                }
            }
        }

        return Instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr06.getInstance().hashCode());
                    }
            ).start();
        }
    }

}
