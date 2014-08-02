package com.hollywood.feeservice.rest.model;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hollywood.feeservice.rest.model.impl.FeeRequestImpl;

public class JsonTest {

  @Test
  public void testName() throws Exception {
    FeeRequest req = new FeeRequestImpl("a1f");
    ObjectMapper objMapper = new ObjectMapper();
    String jsonString = objMapper.writeValueAsString(req);
    System.out.println(jsonString);
  }
}
