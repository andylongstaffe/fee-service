package uk.gov.ipo.fast.feeservice.rest.model.impl;

import uk.gov.ipo.fast.feeservice.rest.model.Price;

public class PriceImpl implements Price {

  private final String amount;
  private final String vatRate;
  private final String currency; 
  
  public PriceImpl(String amount, String vatRate, String currency) {
    this.amount = amount;
    this.vatRate = vatRate;
    this.currency = currency;
  }

  @Override
  public String getAmount() {
    return amount;
  }

  @Override
  public String getVatRate() {
    return vatRate;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

}
