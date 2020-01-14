package com.evan.memento;
import lombok.Data;

import	java.util.HashMap;



import java.util.ArrayList;

/**
 * 这是一个守护者对象，保存游戏角色的状态
 */
@Data
public class Caretaker {

    //如果只保存一次状态可以使用
    private Memento memento;

    // 保存GameRole多个状态
    private ArrayList<Memento> mementos;

    // 保存多个GameRole多个状态
    private HashMap<String, ArrayList<Memento>> rolesMementos;


}
