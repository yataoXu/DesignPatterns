package com.evan.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchaseRequest {

    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

}
