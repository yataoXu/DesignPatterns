package com.evan.responsibilitychain;

/**
 * 校长
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println("请求编号id = " + purchaseRequest.getId() + "被" + this.name + "处理");
        }
    }
}
