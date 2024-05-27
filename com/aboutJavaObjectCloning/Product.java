
package com.aboutJavaObjectCloning;

/**
 * step-1: class required to implements Cloneable interface
 */
public class Product implements Cloneable {

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

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProduct() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Product product1 = new Product(1, "Laptop ", 78605.3);
		System.out.println(product1.getProduct());
		System.out.println(product1.hashCode());

		// ste2: call clone() method of Object and type cast to required object
		Product product2 = (Product) product1.clone();
		product2.setProductPrice(28889.23);
		System.out.println(product2.getProduct());
		System.out.println(product1.getProduct());
		System.out.println(product2.hashCode());

	}

}
