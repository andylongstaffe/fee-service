package com.hollywood.feeservice.rest.service.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hollywood.feeservice.rest.dao.FeeManagerDao;
import com.hollywood.feeservice.rest.dao.impl.FeeManagerMemoryDao;
import com.hollywood.feeservice.rest.exception.NotFoundException;
import com.hollywood.feeservice.rest.model.Fee;
import com.hollywood.feeservice.rest.model.impl.FeeRequestImpl;
import com.hollywood.feeservice.rest.service.ProductFeeRequester;


@Path("/fee")
@Service
public class ProductFeeService implements ProductFeeRequester {
 
  @Autowired
  private FeeManagerDao feeDao;
  
  public static final Logger log = LoggerFactory.getLogger(ProductFeeRequester.class);

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello from Jersey";
  }
  
  @POST
  @Path("/calculate")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Fee calculateFee(FeeRequestImpl request) {
    Fee fee = feeDao.getProductFee(request.getProductCode());
    if ( fee == null ) {
      log.info("returning not found....");
      throw new WebApplicationException(Response.Status.NOT_FOUND);
    }
    return fee;
  }
  
  @Override
  @GET
  @Path("/product/{productCode}")
  @Produces(MediaType.APPLICATION_JSON)
  public Fee getProductFee(@PathParam("productCode") String productCode) {
    Fee fee = feeDao.getProductFee(productCode);
    if ( fee == null ) {
      throw new NotFoundException("Product code " + productCode + " not found.");
    }
    else {
      return fee;
    }
  }


  @GET
  @Path("/product/")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Fee> getAllProductFees() {
    return feeDao.getAllProductFees();
  }

  /**
  @POST
  @Path("/product/{productCode}")
  @Produces(MediaType.APPLICATION_JSON)
  @Override
  public boolean createProductFee(ProductFee fee) {
    // TODO - review return type
    feeDao.insertProductFee(fee);
    return true;
  }

  @PUT
  @Path("/product/{productCode}")
  @Produces(MediaType.APPLICATION_JSON)
  @Override
  public boolean updateProductFee(String productCode, ProductFee fee) {
    // TODO - review return type and parameters here
    feeDao.updateProductFee(fee);
    return true;
  }

  @DELETE
  @Path("/product/{productCode}")
  @Produces(MediaType.APPLICATION_JSON)
  @Override
  public boolean deleteProductFee(@PathParam("productCode") String productCode) {
    feeDao.deleteProductFee(productCode);
    return true;
  }
  
  */



}
