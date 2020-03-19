package com.evan.inversion;

public class Driver implements IDriver {
    @Override
    public void driver(ICar car) {
        car.name();
        car.run();
    }

}
