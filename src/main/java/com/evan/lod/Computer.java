package com.evan.lod;

public class Computer {

    public void saveCurrentTask() {
        //do something
    }

    public void closeService() {
        //do something
    }

    public void closeScreen() {
        //do something
    }

    public void closePower() {
        //do something
    }

    public void close() {
        saveCurrentTask();
        closeService();
        closeScreen();
        closePower();
    }
}
