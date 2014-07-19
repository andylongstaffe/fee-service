package uk.gov.ipo.fast.feeservice.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.gov.ipo.fast.feeservice.rest.dao.FeeManagerDao;
import uk.gov.ipo.fast.feeservice.rest.dao.impl.FeeManagerMemoryDao;

//@Configuration
public class AppConfig {

  //@Bean
  public FeeManagerDao feeManagerMemoryDao() {
    return new FeeManagerMemoryDao();
  }
  
}
