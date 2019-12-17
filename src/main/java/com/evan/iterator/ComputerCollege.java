package com.evan.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    // 保存当前数组的对象个数
    int numOfDepartment = 0;


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("PHP专业", "PHP专业");
        addDepartment("go专业", "go专业");
        addDepartment(".net专业", ".net专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
