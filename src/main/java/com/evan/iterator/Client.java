package com.evan.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoColleage infoColleage = new InfoColleage();

        collegeList.add(computerCollege);
        collegeList.add(infoColleage);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
