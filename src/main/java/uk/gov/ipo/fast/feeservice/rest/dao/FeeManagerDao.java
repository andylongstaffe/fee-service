package uk.gov.ipo.fast.feeservice.rest.dao;

import java.util.List;

import uk.gov.ipo.fast.feeservice.rest.model.ProductFee;

public interface FeeManagerDao
{
	public ProductFee getProductFee(String productCode);
	
	public List<ProductFee> getAllProductFees();
	
	public void insertProductFee(ProductFee fee);
	
	public void updateProductFee(ProductFee fee);
	
	public void deleteProductFee(String productCode);
}
