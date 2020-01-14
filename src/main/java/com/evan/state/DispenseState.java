package com.evan.state;

public class DispenseState extends State {


    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }


    /**
     * 当前状态可以扣除积分，扣除后，将状态设置成可以抽奖的状态
     */
    @Override
    public void deductMoney() {

        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }


    // 发放奖品
    @Override
    public void dispensePrize() {

        if (activity.getCount() > 0) {
            System.out.println("恭喜你中奖了");
            // 改变状态不能抽奖
            activity.setState(activity.getNoRaffleState());

        } else {
            System.out.println("把人家的积分还给人家");
            System.out.println("很遗憾，奖品发完了");
            // 改变状态为奖品发放完毕，抽奖end
            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }
    }
}
