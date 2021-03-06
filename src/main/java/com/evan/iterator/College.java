package com.evan.iterator;

import java.util.Iterator;

public interface College {

    public String getName();

    // 增加系的方法
    public void addDepartment(String name, String desc);

    // 返回一个迭代器，遍历用
    public Iterator createIterator();

}
