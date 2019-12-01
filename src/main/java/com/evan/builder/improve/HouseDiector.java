package com.evan.builder.improve;

/**
 * @Description
 * @ClassName HouseDiector
 * @Author Evan
 * @date 2019.11.30 14:09
 */
public class HouseDiector {

    Builder houseBuilder;

    public HouseDiector(Builder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(Builder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //  如何处理建造房子的流程，交给指挥者处理
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.rootfed();
        return houseBuilder.buildHouse();
    }

}
