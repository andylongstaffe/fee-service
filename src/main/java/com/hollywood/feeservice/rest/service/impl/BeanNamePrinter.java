package com.hollywood.feeservice.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanNamePrinter {
  
  @Autowired
  private ApplicationContext applicationContext;
  
  public String print() {
    String[] beans = applicationContext.getBeanDefinitionNames(); 
    StringBuffer sb = new StringBuffer();
    for (String b : beans) { 
       sb.append(" *** " + b); 
    }
    return sb.toString();
  }
  
}
