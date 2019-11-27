//package com.evan.inversion;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @Description 迪米特法则
// * @ClassName Demeter1
// * @Author Evan
// * @date 2019.11.26 21:29
// */
//
//// 客户端
//public class Demeter1 {
//
//    public static void main(String[] args) {
//        EmployeeManager employeeManager = new EmployeeManager();
//        employeeManager.println(new StoreEmployeeeManager());
//    }
//
//
//}
//
//// 总部
//class Employee {
//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
//
//// 店面员工
//class StoreEmployee {
//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
//
//// 店面员工管理类
//class StoreEmployeeeManager {
//    public List<StoreEmployee> getAllStoreEmployees() {
//        List<StoreEmployee> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            StoreEmployee storeEmployee = new StoreEmployee();
//            storeEmployee.setId(i);
//            list.add(storeEmployee);
//        }
//        return list;
//    }
//}
//
//// 总部员工管理类
//class EmployeeManager {
//    public List<Employee> getAlLEmployees() {
//        List<Employee> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Employee employee = new Employee();
//            employee.setId(i);
//            list.add(employee);
//        }
//        return list;
//    }
//
//    void println(StoreEmployeeeManager storeEmployeeeManager){
//
//        // 总部员工
//
//        List<Employee> alLEmployees = this.getAlLEmployees();
//
//        System.out.println("==============总部员工===============");
//        for (int i = 0; i < alLEmployees.size(); i++) {
//            System.out.println(alLEmployees.get(i).getId());
//        }
//
//        List<StoreEmployee> allStoreEmployees = storeEmployeeeManager.getAllStoreEmployees();
//        System.out.println("==============店面员工===============");
//        for (int i = 0; i < allStoreEmployees.size(); i++) {
//            System.out.println(allStoreEmployees.get(i).getId());
//        }
//    }
//}