package com.hollywood.feeservice.rest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hollywood.feeservice.rest.dao.FeeManagerDao;
import com.hollywood.feeservice.rest.service.impl.ProductFeeService;

public class SpringAnnotationTest {

  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
      // FeeManagerDao dao = (FeeManagerDao) context.getBean("FeeInMemoryDao");
      // System.out.println(dao.getProductFee("a1f"));
      ProductFeeService service = (ProductFeeService) context.getBean("fs");
      System.out.println(service.getProductFee("a1f"));

  }
  
  /**
  
  <context:annotation-config />

  <bean id="myFeeService" class="com.hollywood.feeservice.rest.service.impl.ProductFeeService" />
  <bean id="feeManagerDao" class="com.hollywood.feeservice.rest.dao.impl.FeeManagerMemoryDao" />
  
  */
  
  

}
