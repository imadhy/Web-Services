package com.univ.alma;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	
	private List<Product> products;
	private List<Product> cart;
	
	public Supplier() {
		
		this.products = new ArrayList<Product>();
		products.add(new Product(1, "iPhone 6s", 5, 699, "iphone6s.jpg"));
		products.add(new Product(2, "iPhone 5", 2, 450, "iphone5.jpg"));
		products.add(new Product(3, "Samsung Galaxy 6 Edge+", 3, 750, "samsungs6edge.jpg"));
		products.add(new Product(4, "Meizu Pro 5", 0, 500, "meizu.jpg"));
	}
	
	public boolean addToCart(Product addedProduct) {
		this.cart = new ArrayList<Product>();
		
		if(addedProduct.getQuantity() == 0)
			return false;
		else {
			cart.add(addedProduct);
			return true;
		}
	}
	
	public int cartItems() {
		return this.cart.size();
	}
	
	public List<Product> GetCartList() {
		return this.cart;
	}
	
	public void emptyCart() {
		this.cart.clear();
	}
	
	public List<Product> GetProductsList() {
		
		return this.products;
	}
}