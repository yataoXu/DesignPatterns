package com.evan.mediator;

public class CoffeeMachine extends Colleague {


    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registerColleague(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        // 调用中介者对象的getMessage()
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void StartCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        SendMessage(0);
    }
}
