package com.evan.brige;

/**
 * @Description
 * @ClassName FolderPhone
 * @Author Evan
 * @date 2019.12.02 21:36
 */
public class FolderPhone extends Phone {
    public FolderPhone(Brand brand) {
        super(brand);
    }
    public void open() {

        System.out.println("Folder手机");
        super.open();
    }

    public void close() {
        System.out.println("Folder手机");
        super.close();

    }

    public void call() {
        System.out.println("Folder手机");
        super.call();

    }
}
