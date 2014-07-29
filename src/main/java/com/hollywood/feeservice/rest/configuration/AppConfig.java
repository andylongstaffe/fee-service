package com.hollywood.feeservice.rest.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hollywood.feeservice.rest.dao.FeeManagerDao;
import com.hollywood.feeservice.rest.dao.impl.FeeManagerMemoryDao;
import com.hollywood.feeservice.rest.service.impl.ProductFeeService;

@Configuration
@ComponentScan(basePackages = {"uk.gov.ipo.fast.feeservice.rest"})
public class AppConfig {

  @Bean
  public FeeManagerDao feeManagerMemoryDao() {
    return new FeeManagerMemoryDao();
  }
  
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ProductFeeService service = context.getBean(ProductFeeService.class);
    System.out.println(service.getAllProductFees());
  }
  
}
