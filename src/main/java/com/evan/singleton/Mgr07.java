package com.evan.singleton;

/**
 * @Description 静态内部类方式
 * JVM保证单例 JVM 加载一个class的时候只加载一次
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @ClassName Mgr07
 * @Author Evan
 * @date 2019.11.24 11:53
 */
public class Mgr07 {

    private Mgr07() {
    }

    public static class Mgr07Holder {
        private final static Mgr07 Instance = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.Instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr07.getInstance().hashCode());
                    }
            ).start();
        }
    }

}
