package com.evan.inversion;

public class OpenAndClose implements IOpenAndClose {

    public ITV itv;


    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}
