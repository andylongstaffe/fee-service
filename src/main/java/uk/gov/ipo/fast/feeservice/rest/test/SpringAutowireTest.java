package uk.gov.ipo.fast.feeservice.rest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.gov.ipo.fast.feeservice.rest.dao.FeeManagerDao;
import uk.gov.ipo.fast.feeservice.rest.service.impl.ProductFeeService;

public class SpringAutowireTest {

  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
      // FeeManagerDao dao = (FeeManagerDao) context.getBean("FeeInMemoryDao");
      // System.out.println(dao.getProductFee("a1f"));
      ProductFeeService service = (ProductFeeService) context.getBean("myFeeService");
      System.out.println(service.getProductFee("a1f"));

  }
  
  /**
  
  <context:annotation-config />

  <bean id="myFeeService" class="uk.gov.ipo.fast.feeservice.rest.service.impl.ProductFeeService" />
  <bean id="feeManagerDao" class="uk.gov.ipo.fast.feeservice.rest.dao.impl.FeeManagerMemoryDao" />
  
  */
  
  

}
