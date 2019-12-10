package com.evan.command;

/**
 * @Description
 * @ClassName LightOffCommand
 * @Author Evan
 * @date 2019.12.10 22:46
 */
public class LightOffCommand implements Command {

    // 聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();

    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
