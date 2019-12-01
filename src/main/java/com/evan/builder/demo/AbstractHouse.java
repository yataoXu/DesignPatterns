package com.evan.builder.demo;

/**
 * @Description
 * @ClassName AbstractHouse
 * @Author Evan
 * @date 2019.11.30 13:28
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void rootfed();

    public void build() {
        buildBasic();
        buildWalls();
        rootfed();
    }
}
