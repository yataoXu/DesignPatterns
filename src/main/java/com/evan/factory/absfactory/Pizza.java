package com.evan.factory.absfactory;

/**
 * @Description
 * @ClassName Pizza
 * @Author Evan
 * @date 2019.11.27 23:44
 */
public abstract class Pizza {

    // pizza 的名字
    private String name;

    // 准备材料，不同的名字的pizza 材料不一样
    public abstract void prepare();


    public void bake() {
        System.out.println("烘烤");
    }

    // cut
    public void cut() {
        System.out.println("切分");
    }

    // box
    public void box() {
        System.out.println("打包");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
