package com.evan.mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registerColleague(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("it is time to watch TV ");
    }

    public void stopTV() {
        System.out.println("TV is stop");
    }
}
