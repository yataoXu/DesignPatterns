package com.evan.command;

/**
 * @Description
 * @ClassName LightOnCommand
 * @Author Evan
 * @date 2019.12.10 22:43
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }
}
