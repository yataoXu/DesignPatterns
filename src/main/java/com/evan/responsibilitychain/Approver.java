package com.evan.responsibilitychain;

public abstract class Approver {
    // 下一个处理者
    Approver approver;
    // 名字
    String name;

    public Approver(String name){
        this.name = name;
    }

    // 下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法，得到一个请求
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
