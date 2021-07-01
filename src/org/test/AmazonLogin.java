package org.test;

public class AmazonLogin {
	
	private void Login() {
	
		System.out.println("Launch url");
		System.out.println("Enter user name and Password");
		System.out.println("Click login");
		
		System.out.println("Success");
	}
	
	private void AddProduct() {
		System.out.println("Select the Product");
		System.out.println("Add to cart");

	}
	
	public static void main(String[] args) {
		
		
		AmazonLogin l = new AmazonLogin();
		l.Login();
		l.AddProduct();
		
		
	}

}
