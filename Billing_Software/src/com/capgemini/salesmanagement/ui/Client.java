package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.util.CollectionUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();

	}

	public static void showMenu() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 for  input");
			System.out.println("Enter 2 for exit");
			System.out.println("Enter the choice");
			int choice = scanner.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter the product code");
				int productCode = scanner.nextInt();
				System.out.println("Enter the quantity");
				int quantity = scanner.nextInt();
				System.out.println("Enter the product category");
				String productCat = scanner.next();
				System.out.println("Enter the product name");
				String productName = scanner.next();
				System.out.println("Enter the product description");
				String productDescription = scanner.next();
				System.out.println("Enter the product price");
				int productPrice = scanner.nextInt();
				CollectionUtil Collection=new CollectionUtil(productCode,quantity,productCat,productName,productDescription,productPrice);
				
				System.out.println(Collection.getCollection());
				break;
			case 2:System.exit(0);
			break;
			}
		}
	}
}
