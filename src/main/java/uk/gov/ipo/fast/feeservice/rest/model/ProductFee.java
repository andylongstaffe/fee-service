package uk.gov.ipo.fast.feeservice.rest.model;

public interface ProductFee {

  String getProductCode();
  
  String getProductGroup();
  
  Price getPrice();
  
  // Date getDate();
  
}