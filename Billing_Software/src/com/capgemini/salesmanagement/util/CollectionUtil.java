package com.capgemini.salesmanagement.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
	private static Map<Integer, Sale> sales = new HashMap<Integer, Sale>();
	Sale sale=null;
	public CollectionUtil(int productCode,int quantity,String productCat,String productName,String productDescription,int productPrice)
	{
		sale=new Sale(productCode,productName,productCat,quantity);
		
		sale.setSaleId(new Random().nextInt(10000)+1);
		sale.setSaleDate(LocalDate.now());
		sale.setLineTotal(productPrice*quantity);
		sales.put(sale.getSaleId(), sale);
	}
	
	
	public static HashMap<Integer, Sale> getCollection() {
		return (HashMap<Integer, Sale>) sales;
	}

}
