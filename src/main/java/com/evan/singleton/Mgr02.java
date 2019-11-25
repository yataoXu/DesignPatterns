package com.evan.singleton;

/**
 * @Description
 * @ClassName Mgr02
 * @Author Evan
 * @date 2019.11.24 11:11
 */
public class Mgr02 {
    private static Mgr02 Instance;

    static {
        Instance = new Mgr02();
    }

    private Mgr02() {
    }

    public static Mgr02 getInstance() {
        return Instance;
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);

    }
}
