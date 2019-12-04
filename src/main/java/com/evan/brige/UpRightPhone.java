package com.evan.brige;

/**
 * @Description
 * @ClassName UpRightPhone
 * @Author Evan
 * @date 2019.12.02 21:29
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void open() {
        System.out.println("直板手机");
        super.open();
    }

    public void close() {
        System.out.println("直板手机");
        super.close();

    }

    public void call() {
        System.out.println("直板手机");
        super.call();

    }
}
