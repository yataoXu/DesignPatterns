package com.evan.composite;

/**
 * @Description
 * @ClassName DepartMent
 * @Author Evan
 * @date 2019.12.05 20:37
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    // 作为叶子节点就不需要有add remove


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("=============="+getName()+"====================");
    }
}
