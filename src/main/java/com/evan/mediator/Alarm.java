package com.evan.mediator;

// 具体的同事类
public class Alarm extends Colleague {


    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registerColleague(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        // 调用中介者对象的getMessage()
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }
}
