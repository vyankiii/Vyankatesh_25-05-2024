
package com.aboutObjectClass;

public class Product {

	/**
	 * Fields and Methods
	 */
	private int productId;
	private String productName;
	private double productPrice;

	public Product() {

	}

	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProduct() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}
