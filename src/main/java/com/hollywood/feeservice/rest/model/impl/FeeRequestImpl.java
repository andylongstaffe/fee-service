package com.hollywood.feeservice.rest.model.impl;

import com.hollywood.feeservice.rest.model.FeeRequest;

public class FeeRequestImpl implements FeeRequest {

  String productCode;
  
  public FeeRequestImpl() {
    
  }
  
  public FeeRequestImpl(String productCode) {
    this.productCode = productCode;
  }
  
  @Override
  public String getProductCode() {
    return productCode;
  }

}
