package com.evan.inversion;

public class Benz implements ICar {
    @Override
    public void name() {
        System.out.println("benz");
    }

    @Override
    public void run() {
        System.out.println("百米加速3s");
    }
}
