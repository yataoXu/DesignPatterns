package com.evan.state;

public class Client {
    public static void main(String[] args) {
        // 创建一个活动
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 300; i++) {

            System.out.println("========第" + i + "次抽奖==========");

            // 第一步扣除积分
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }
}
