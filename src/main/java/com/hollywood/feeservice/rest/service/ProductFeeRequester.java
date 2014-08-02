package com.hollywood.feeservice.rest.service;

import com.hollywood.feeservice.rest.model.Fee;

public interface ProductFeeRequester {

  Fee getProductFee(String productCode);
  
}
