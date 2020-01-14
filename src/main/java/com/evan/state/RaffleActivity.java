package com.evan.state;


/**
 * 抽奖活动
 */
public class RaffleActivity {

    //State 表示活动当前的状态，是变化的
    State state = null;

    // 奖品数量
    int count = 0;

    // 四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * 1. 初始化当前的状态为noRaffleState
     * 2. 初始化奖品数量
     * @param count
     */
    public RaffleActivity(int count){
        this.state = getNoRaffleState();
        this.count = count;
    }


    // 扣分，调用当前状态的deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    // 抽奖
    public void raffle(){
        // 如果当前的状态是抽奖成功
        if(state.raffle()){
            // 领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int current = count;
        count --;
        return current;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }


    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }


}

