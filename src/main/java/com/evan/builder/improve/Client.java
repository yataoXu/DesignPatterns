package com.evan.builder.improve;

/**
 * @Description
 * @ClassName Client
 * @Author Evan
 * @date 2019.11.30 14:17
 */
public class Client {
    public static void main(String[] args) {
        // 改普通房
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDiector handler = new HouseDiector(commonHouse);
        // 完成盖房子，并返回
        House house = handler.constructHouse();

    }
}
