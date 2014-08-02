package com.hollywood.feeservice.rest.model.impl;

import com.hollywood.feeservice.rest.model.Price;
import com.hollywood.feeservice.rest.model.Fee;

public class ProductFee implements Fee {

  private final String code;
  private final Price price;
  
  public ProductFee(String code, String amount, String vatRate, String currency) {
    this.code = code;
    this.price = new PriceImpl(amount, vatRate, currency);
  }
  
  @Override
  public String getProductCode() {
    return code;
  }

  @Override
  public Price getPrice() {
    return price;
  }

}
