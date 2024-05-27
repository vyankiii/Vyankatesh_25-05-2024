package com.aboutJavaObjectLifeCycle;

public class TestClass {

	public static void main(String[] args) {

		
		Product product = new Product(1, "Mobile Phone", 76786.98);
		System.out.println(product.getProduct());

		product = null;
		
		System.gc();
		
	}

}
