package com.evan.inversion;

public class DepencyMain {
    public static void main(String[] args) {
        MITV mitv = new MITV();
        OpenAndClose openAndClose = new OpenAndClose(mitv);
        openAndClose.open();
    }
}
