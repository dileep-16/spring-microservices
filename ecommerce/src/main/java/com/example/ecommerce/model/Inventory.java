package com.example.ecommerce.model;

import java.util.List;

/**
 * @author dileep
 *
 *  This model class represent inventory for available
 *  products in the database
 */
public class Inventory {
	
	private String productId;
	private String name;
	private int cost;
	private int quantity;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
