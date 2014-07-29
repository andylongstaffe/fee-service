package com.hollywood.feeservice.rest.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hollywood.feeservice.rest.configuration.AppConfig;
import com.hollywood.feeservice.rest.model.ProductFee;
import com.hollywood.feeservice.rest.service.impl.ProductFeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class TestProductFeeservice {

  @Autowired
  ProductFeeService service;

  @Test
  public void thatAllProductFeesAreReturned() {
    List<ProductFee> fees = service.getAllProductFees();
    Assert.assertEquals(3, fees.size());
  }

}
