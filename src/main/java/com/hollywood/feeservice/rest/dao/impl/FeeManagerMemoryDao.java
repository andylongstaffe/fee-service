package com.hollywood.feeservice.rest.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hollywood.feeservice.rest.dao.FeeManagerDao;
import com.hollywood.feeservice.rest.model.ProductFee;
import com.hollywood.feeservice.rest.model.impl.ProductFeeImpl;


public class FeeManagerMemoryDao implements FeeManagerDao {

  public static final Logger log = LoggerFactory.getLogger(FeeManagerMemoryDao.class);

  public FeeManagerMemoryDao() {    
    productFees.put("a1f", new ProductFeeImpl("a1f", "general", "75.00", "0.00", "gbp"));
    productFees.put("p09a", new ProductFeeImpl("p09a", "patents", "150.00", "0.00", "gbp"));
    productFees.put("cit", new ProductFeeImpl("cit", "general", "10.00", "0.00", "gbp"));
  }

  Map<String, ProductFee> productFees = new HashMap<String, ProductFee>();
  
  @Override
  public ProductFee getProductFee(String productCode) {
    log.debug("Fetching product fee with product code = " + productCode);
    return productFees.get(productCode);
  }

  @Override
  public List<ProductFee> getAllProductFees() {
    return new ArrayList<ProductFee>(productFees.values());
  }

  @Override
  public void insertProductFee(ProductFee productFee) {
    productFees.put(productFee.getProductCode(), productFee);
    log.info("Product fee added " + productFee);
    log.debug("Current users:");
    for (String c : productFees.keySet()) {
      log.debug(c);
    }

  }

  @Override
  public void updateProductFee(ProductFee productFee) {
    // TODO Auto-generated method stub
  }

  @Override
  public void deleteProductFee(String productCode) {
    // TODO Auto-generated method stub
    
  }
}
