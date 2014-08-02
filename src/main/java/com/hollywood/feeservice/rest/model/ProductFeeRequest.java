package com.hollywood.feeservice.rest.model;


public class ProductFeeRequest {
	
  public Fee getProductFee() {
    return productFee;
  }

  public void setProductFee(Fee productFee) {
    this.productFee = productFee;
  }

  private Fee productFee;

}
