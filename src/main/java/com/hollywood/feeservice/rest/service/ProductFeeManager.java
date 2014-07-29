package com.hollywood.feeservice.rest.service;

import java.util.List;

import com.hollywood.feeservice.rest.model.ProductFee;

public interface ProductFeeManager {

	public ProductFee getProductFee(String productCode);
	
	public List<ProductFee> getAllProductFees();
	
	public boolean createProductFee(ProductFee fee);
	
	public boolean updateProductFee(String productCode, ProductFee fee);
	
	public boolean deleteProductFee(String productCode);
	
}
