package com.evan.builder.improve;

/**
 * @Description
 * @ClassName HighBUilding
 * @Author Evan
 * @date 2019.11.30 14:06
 */
public class HighBUilding extends Builder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基1000米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙 100米");
    }

    @Override
    public void rootfed() {
        System.out.println("高楼封顶 透明");
    }
}
