package com.hollywood.feeservice.rest.service;

import java.util.List;

import com.hollywood.feeservice.rest.model.Fee;

public interface ProductFeeManager {

	public Fee getProductFee(String productCode);
	
	public List<Fee> getAllProductFees();
	
	public boolean createProductFee(Fee fee);
	
	public boolean updateProductFee(String productCode, Fee fee);
	
	public boolean deleteProductFee(String productCode);
	
}
