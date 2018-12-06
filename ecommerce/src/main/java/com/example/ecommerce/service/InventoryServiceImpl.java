package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecommerce.dao.InventoryDao;
import com.example.ecommerce.model.Inventory;
@Service
public class InventoryServiceImpl implements InventoryService {
   @Autowired InventoryDao inventorydao;
	@Override
	@Transactional(readOnly=true)
	public List<Inventory> getInventoryUpdates() {
		// TODO Auto-generated method stub
		return inventorydao.getInventoryUpdates();
	}

	@Override
	@Transactional
	public String deleteProduct(String productId) {
		try {
			// fetching product from inventory
			Inventory productToDelete = inventorydao.getProduct(productId);
			if (productToDelete != null) {
				//if product quantity is one
				if (productToDelete.getQuantity() <= 1) {
					return inventorydao.deleteProduct(productId);
				} else {
					//if product quantity is more than one
					productToDelete.setQuantity(productToDelete.getQuantity() - 1);
					return inventorydao.addProduct(productToDelete);

				}
			}
		} catch (Exception e) {
			// TODO logger implementation
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public String addProduct(Inventory product) {
		// TODO functionality to add  product to inventory
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public boolean isProductAvailavle(String productId) {
		// TODO functionality to check if product available
		return true;
	}
}
