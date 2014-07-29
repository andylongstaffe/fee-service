package com.hollywood.feeservice.rest.service;

import com.hollywood.feeservice.rest.model.ProductFee;

public interface ProductFeeRequester {

  ProductFee getProductFee(String productCode);
  
}
