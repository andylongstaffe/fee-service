package uk.gov.ipo.fast.feeservice.rest.model;

public interface Response {


  boolean isSuccess();

  void setSuccess(Boolean success);

  String getErrorMessage();

  void setErrorMessage(String errorMessage);

}
