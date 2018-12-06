package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Inventory;



public interface InventoryService {
	/**
	 * fetch inventory status for available
	 * product details in store
	 * 
	 * @return Inventory
	 */
	public List<Inventory> getInventoryUpdates();
	
	/**
	 * updating inventory after product's order or sale
	 * 
	 * @param productId
	 * @return productId for updated 
	 */
	public String deleteProduct(String productId);
	
	/**
	 * adding new product to inventory
	 * 
	 * @param product
	 * @return productId 
	 */
	public String addProduct(Inventory product);

	/**
	 * it checks if product available in the inventory for order
	 * 
	 * @param productId
	 * @return boolean
	 */
	public boolean isProductAvailavle(String productId);
	
}
