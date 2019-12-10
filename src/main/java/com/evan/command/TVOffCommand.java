package com.evan.command;

/**
 * @Description
 * @ClassName TVOffCommand
 * @Author Evan
 * @date 2019.12.10 22:49
 */
public class TVOffCommand implements Command {

    // 聚合TVReceiver

    TVReceiver tv;

    // 构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.on();
    }
}
