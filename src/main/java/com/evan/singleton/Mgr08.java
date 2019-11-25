package com.evan.singleton;

/**
 * @Description 不仅可以坚决线程问题，且可以防止反序列化
 * @ClassName Mgr08
 * @Author Evan
 * @date 2019.11.24 12:02
 */
public enum Mgr08 {

    INSTANCE;


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () -> {
                        System.out.println(Mgr08.INSTANCE.hashCode());
                    }
            ).start();
        }
    }
}

//反序列化
//枚举类没有构造方法