package com.example.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Inventory;

@Repository
public class InventoryDaoImpl implements InventoryDao {
    @Autowired MongoTemplate mongotemplate;
    @Override
	public List<Inventory> getInventoryUpdates() {
		
		try {
			return mongotemplate.find(new Query(),Inventory.class);
		} catch (Exception e) {
			// TODO logging for database exception
			e.printStackTrace();
		}
		return new ArrayList<Inventory>();
	}

	@Override
	public String deleteProduct(String productId) {
		try {
			Query query=new Query();
			Criteria criteria=Criteria.where("productId").is(productId);
			query.addCriteria(criteria);
			mongotemplate.remove(query,Inventory.class);
		} catch (Exception e) {
			// TODO logging for database exception
			e.printStackTrace();
		}
		return productId;
	}

	@Override
	public String addProduct(Inventory product) {
		try {
			mongotemplate.save(product);
		} catch (Exception e) {
			// TODO logging for database exception
			e.printStackTrace();
			throw e;
		}
		return product.getProductId();
	}

	@Override
	public boolean isProductAvailavle(String productId) {
		// TODO functionality to check if product available in inventory
		return true;
	}

	@Override
	public Inventory getProduct(String productId) {
		Inventory inventory=null;
		
		try {
			Query query=new Query();
			Criteria criteria=Criteria.where("productId").is(productId);
			query.addCriteria(criteria);
			inventory= mongotemplate.findOne(query,Inventory.class);
		} catch (Exception e) {
			// TODO logging for database exception
			e.printStackTrace();
		}
		return inventory;
	}
}
