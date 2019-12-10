package com.evan.command;

/**
 * @Description 创建命令接口
 * @ClassName Command
 * @Author Evan
 * @date 2019.12.10 22:41
 */
public interface Command {

    // 执行动作(操作)
    public void execute();

    // 撤销动作(操作)
    public void undo();
}
