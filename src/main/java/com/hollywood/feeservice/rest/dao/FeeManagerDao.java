package com.hollywood.feeservice.rest.dao;

import java.util.List;

import com.hollywood.feeservice.rest.model.Fee;

public interface FeeManagerDao
{
	public Fee getProductFee(String productCode);
	
	public List<Fee> getAllProductFees();
	
	public void insertProductFee(Fee fee);
	
	public void updateProductFee(Fee fee);
	
	public void deleteProductFee(String productCode);
}
