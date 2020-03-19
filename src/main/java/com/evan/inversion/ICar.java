package com.evan.inversion;

public interface ICar {

    default void run() {
        System.out.println("老子是车，肯定会跑呀");
    }

    void name();
}
