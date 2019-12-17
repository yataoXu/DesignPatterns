package com.evan.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoColleage implements College{


    List<Department> departmentList;


    public InfoColleage(){
        departmentList = new ArrayList<>();
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");

    }


    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
      Department department = new Department(name,desc);
      departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
