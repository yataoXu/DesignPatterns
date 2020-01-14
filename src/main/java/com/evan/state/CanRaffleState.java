package com.evan.state;

import java.util.Random;


/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {


    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }


    /**
     * 已经扣除过积分，不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("已经扣除过积分，不能再扣");

    }

    /**
     * 可以抽奖，抽奖后根据情况，改变新的状态
     *
     * @return
     */
    @Override
    public boolean raffle() {

        System.out.println("正在抽奖，请稍后");

        Random random = new Random();
        int i = random.nextInt(10);


        // 10%的中奖机会
        if (i == 0){
            // 改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾，你没有中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }


    /**
     * 不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
