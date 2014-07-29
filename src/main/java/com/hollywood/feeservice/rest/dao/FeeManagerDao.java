package com.hollywood.feeservice.rest.dao;

import java.util.List;

import com.hollywood.feeservice.rest.model.ProductFee;

public interface FeeManagerDao
{
	public ProductFee getProductFee(String productCode);
	
	public List<ProductFee> getAllProductFees();
	
	public void insertProductFee(ProductFee fee);
	
	public void updateProductFee(ProductFee fee);
	
	public void deleteProductFee(String productCode);
}
