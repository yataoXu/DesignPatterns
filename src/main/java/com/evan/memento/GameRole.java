package com.evan.memento;

import lombok.Data;

@Data
public class GameRole {
    // 攻击力
    private int vit;
    // 防御力
    private int def;

    // 创建Memento 即根据当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 从备忘录中得到GameRole的状态
    public void recoverGameRoleMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }


    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + "防御力" + this.def);
    }


}
