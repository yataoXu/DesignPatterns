package com.evan.mediator;


import java.util.HashMap;

// 具体的中介者类
public class ConcreteMediator extends Mediator {

    // 所有的同事对象
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;


    public ConcreteMediator() {
        colleagueHashMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }


    public ConcreteMediator(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }


    @Override
    public void registerColleague(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }


    /**
     * 具体中介者的核心方法
     * 1. 根据得到的消息，完成对应的任务
     * 2. 中介者在这个方法中，协调各个具体的同事对象，完成任务
     *
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {

        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueHashMap.get(interMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueHashMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV) (colleagueHashMap.get(interMap.get("TV")))).stopTV();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueHashMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (colleagueHashMap.get(colleagueName) instanceof TV) {//如果TV发现消息

        } else if (colleagueHashMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发出的消息，这里处理...
        }
    }

    @Override
    public void sendMessage() {

    }
}
