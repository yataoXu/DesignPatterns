package com.evan.brige;

/**
 * @Description
 * @ClassName Phoe
 * @Author Evan
 * @date 2019.12.02 21:18
 */
public abstract class Phone  {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
