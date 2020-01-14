package com.evan.state;

//奖品发放完毕的状态
// 当activity改为 DispenseOutState ,抽奖活动结束
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次再参见");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次再参见");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次再参见");
    }
}
