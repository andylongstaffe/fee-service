package uk.gov.ipo.fast.feeservice.rest.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uk.gov.ipo.fast.feeservice.rest.dao.FeeManagerDao;
import uk.gov.ipo.fast.feeservice.rest.dao.impl.FeeManagerMemoryDao;
import uk.gov.ipo.fast.feeservice.rest.exception.NotFoundException;
import uk.gov.ipo.fast.feeservice.rest.model.ProductFee;
import uk.gov.ipo.fast.feeservice.rest.service.ProductFeeRequester;

@Path("/fee")
public class ProductFeeService implements ProductFeeRequester {

  private FeeManagerDao feeDao = FeeManagerMemoryDao.getInstance();

  public FeeManagerDao getFeeManagerDao() {
    return feeDao;
  }

  public void setFeeManagerDao(FeeManagerDao feeDao) {
    this.feeDao = feeDao;
  }

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello from Jersey";
  }

  @Override
  @GET
  @Path("/product/{productCode}")
  @Produces(MediaType.APPLICATION_JSON)
  public ProductFee getProductFee(@PathParam("productCode") String productCode) {
    ProductFee fee = feeDao.getProductFee(productCode);
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
  public List<ProductFee> getAllProductFees() {
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
