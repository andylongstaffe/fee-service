package uk.gov.ipo.fast.feeservice.rest.model;

public interface Price {

  String getAmount();
  
  String getVatRate();
  
  String getCurrency(); 
}
