package com.evan.singleton;

/**
 * @Description 饿汉模式
 * 类加载到内存后，就实例化一个单例，JVM保证了线程安全
 * 优点：简单实用
 * 缺点：不管用到与否，类装载时就完成实例化（话说你不用你加载干啥）)
 * @ClassName Mgr01
 * @Author Evan
 * @date 2019.11.24 10:55
 */
public class Mgr01 {

    private static Mgr01 Instance = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return Instance;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);

    }
}
