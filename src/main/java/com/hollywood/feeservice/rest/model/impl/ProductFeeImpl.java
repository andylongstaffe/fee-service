package com.hollywood.feeservice.rest.model.impl;

import com.hollywood.feeservice.rest.model.Price;
import com.hollywood.feeservice.rest.model.ProductFee;

public class ProductFeeImpl implements ProductFee {

  private final String code;
  private final String group;
  private final Price price;
  
  public ProductFeeImpl(String code, String group, String amount, String vatRate, String currency) {
    this.code = code;
    this.group = group;
    this.price = new PriceImpl(amount, vatRate, currency);
  }
  
  @Override
  public String getProductCode() {
    return code;
  }

  @Override
  public String getProductGroup() {
    return group;
  }

  @Override
  public Price getPrice() {
    return price;
  }

}
