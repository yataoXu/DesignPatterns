package com.evan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 大学 包含很多院校
 * @ClassName Unvisity
 * @Author Evan
 * @date 2019.12.05 20:26
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }


    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }


    // 输出应该输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=============="+getName()+"====================");
        for (OrganizationComponent organizationComponent:organizationComponents)
        {
            organizationComponent.print();
        }
    }
}
