package com.encapsulation;


//Provide a real-world example where encapsulation might be used in a Java application.

class ElectronicsShop{
	
	private String productName;
	private double productPrice;
	private int stock;
	
	public ElectronicsShop(String productName, double productPrice, int stock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.stock = stock;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getProductPrice()
	{
		return productPrice;
	}
	
	public int getStockQuantity()
	{
		return stock;
	}
	
	
	public void setProductStock(int units)
	{
		if (units > 0 ) {
			stock--;
		}else {
			System.out.println("product is outof stock");
		}
	}
}


public class EncapsulationDemo4 {

	public static void main(String[] args) {
		
		
		ElectronicsShop obj = new ElectronicsShop("Lenovo Laptops", 55000, 0);
		
		System.out.println("Lenovo laptop: "+obj.getProductName());
		System.out.println("price : "+obj.getProductPrice());
		System.out.println("stock :"+obj.getStockQuantity());
		
		
		obj.setProductStock(0);
	}
}
