package com.evan.brige;

/**
 * @Description
 * @ClassName Client
 * @Author Evan
 * @date 2019.12.02 21:32
 */
public class Client {
    public static void main(String[] args) {
        UpRightPhone phone1 = new UpRightPhone(new XiaoMi());
        phone1.close();
        phone1.open();
        phone1.close();

        System.out.println("============================");

        UpRightPhone phone2 = new UpRightPhone(new Vivo());
        phone2.close();
        phone2.open();
        phone2.close();

        System.out.println("============================");

        FolderPhone phone3 = new FolderPhone(new XiaoMi());
        phone3.close();
        phone3.open();
        phone3.close();

        System.out.println("============================");

        FolderPhone phone4 = new FolderPhone(new Vivo());
        phone4.close();
        phone4.open();
        phone4.close();

    }
}
