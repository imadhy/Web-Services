package com.univ.alma;

public class Product {
	
	private int id;
	private String productName;
	private int quantity;
	private double price;
	private String img;
	
	public Product(int id, String productName, int qnty, double price, String img) {
		this.id = id;
		this.productName = productName;
		this.quantity = qnty;
		this.price = price;
		this.img = img;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setQuantity(int q) {
		this.quantity = q;
	}
	public void setPrice(double p) {
		this.price = p;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int getId() {
		return this.id;
	}
	public String getProductName() {
		return this.productName;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public String getImg() {
		return this.img;
	}
}