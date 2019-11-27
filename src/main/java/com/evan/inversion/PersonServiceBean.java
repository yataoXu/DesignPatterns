package com.evan.inversion;

/**
 * @Description
 * @ClassName Person
 * @Author Evan
 * @date 2019.11.26 22:52
 */
public class PersonServiceBean {

    private PersonDao personDao;

    public void save(Person1 person1){}

    public IDCard getIDCard(Integer personId){
        return null;
    }

    public void modify(){
        Department department = new Department();
    }




}

class PersonDao{}

class IDCard{}

class Person1{}

class Department {

}

