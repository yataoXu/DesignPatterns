package com.evan.builder.improve;

/**
 * @Description
 * @ClassName CommonHouse
 * @Author Evan
 * @date 2019.11.30 14:04
 */
public class CommonHouse extends Builder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void rootfed() {
        System.out.println("普通房子封顶");
    }
}
