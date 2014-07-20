package uk.gov.ipo.fast.feeservice.rest.service;

import static com.jayway.restassured.RestAssured.get;
// import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TestFeeServiceUsingRestAssured {

  @BeforeClass
  public static void setup() {
    RestAssured.baseURI = "http://localhost";
    RestAssured.port=8090;
    RestAssured.basePath = "/fee-service/rest";    
  }
  
  @Test
  public void productFeeExists() {
    get("/fee/product/a1f").then().body("productCode", equalTo("a1f"));
  }
  
  @Test
  public void productFeeNotFound() throws Exception {
    Response response = get("/fee/product/xxx").then().contentType(ContentType.TEXT).extract().response();
    assertEquals("Product code xxx not found.",response.asString());
  }

}
