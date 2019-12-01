package com.evan.builder.improve;

/**
 * @Description
 * @ClassName Builder
 * @Author Evan
 * @date 2019.11.30 14:00
 */
// 抽象的建造者
public abstract class Builder {

    protected House house = new House();

    // 将建造流程写好 抽象方法
    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void rootfed();

    // 建造房子
    public House buildHouse(){
        return house;
    }
}
