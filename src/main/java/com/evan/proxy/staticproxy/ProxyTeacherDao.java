package com.evan.proxy.staticproxy;


// 代理对象 静态代理
public class ProxyTeacherDao implements  ITeacherDao {

    private ITeacherDao target;
    public ProxyTeacherDao(ITeacherDao target){
        this.target = target;
    }


    @Override
    public void teacher() {

        System.out.println("代理开始，完成某些操作");
        target.teacher();
        System.out.println("代理关闭，完成某些操作");
    }


}
