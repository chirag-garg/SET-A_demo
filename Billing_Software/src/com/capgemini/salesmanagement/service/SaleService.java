package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public class SaleService implements ISaleService {

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateProductCode(int productid) {
		if (productid == 1001 || productid == 1002 || productid == 1003 || productid == 1004)
			return true;
		else
			return false;
	}

	@Override
	public boolean validateQuantity(int qty) {
		if (qty < 0 && qty > 5)
			return false;
		return true;
	}

	@Override
	public boolean validateProductCat(String prodCat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateProductName(String prodName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateProductPrice(float price) {
		// TODO Auto-generated method stub
		return false;
	}
}
