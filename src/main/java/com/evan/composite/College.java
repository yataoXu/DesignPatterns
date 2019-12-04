package com.evan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName College
 * @Author Evan
 * @date 2019.12.04 22:38
 */
public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();


    // 构造器
    public College(String name, String desc){
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 将来实际业务中，College的add和University add不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }


    // 就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("---------"+getName()+"-----------------");
        for (OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
