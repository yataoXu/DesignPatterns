package com.evan.memento;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gr = new GameRole();
        gr.setDef(100);
        gr.setVit(100);


        System.out.println("和boss 大战前的状态");
        gr.display();

        // 把当前状态保存到Caretaker对象种
        Caretaker caretaker = new Caretaker();
        ArrayList<Memento> mementos = new ArrayList();
        mementos.add(gr.createMemento());

        System.out.println("和boss 大战两分钟");
        gr.setDef(70);
        gr.setVit(70);

        mementos.add(gr.createMemento());
        gr.display();


        System.out.println("和boss 大战四分钟");
        gr.setDef(50);
        gr.setVit(50);
        mementos.add(gr.createMemento());
        gr.display();
        caretaker.setMementos(mementos);

        System.out.println("和boss 大战后，随机恢复");
        Random  r = new Random ();
        int i = r.nextInt(3);

        gr.recoverGameRoleMemento(caretaker.getMementos().get(i));
        System.out.println("恢复后的状态");
        gr.display();

    }
}
