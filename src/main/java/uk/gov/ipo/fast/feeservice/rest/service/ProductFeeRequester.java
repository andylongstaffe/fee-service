package uk.gov.ipo.fast.feeservice.rest.service;

import uk.gov.ipo.fast.feeservice.rest.model.ProductFee;

public interface ProductFeeRequester {

  ProductFee getProductFee(String productCode);
  
}
