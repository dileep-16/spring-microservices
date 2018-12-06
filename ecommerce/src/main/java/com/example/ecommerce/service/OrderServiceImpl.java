package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ecommerce.dao.OrderDao;
import com.example.ecommerce.model.Order;
import com.example.ecommerce.util.GenerateUUID;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired OrderDao orderDao;
	@Autowired InventoryService inventoryService;
	@Autowired MongoTemplate mongoTemplate;

	
	
	@Override
	@Transactional
	public String createOrder(Order order) {
		String orderId = null;
		// TODO validation for order
		
		try {
			boolean isProductAvailableInInventory=inventoryService.isProductAvailavle(order.getProductId());
			
			if(isProductAvailableInInventory) {
				
			orderId = GenerateUUID.getUUUI();
			order.setOrderId(orderId);
			orderDao.createOrder(order);
			inventoryService.deleteProduct(order.getProductId());
			}
			else
			{
				// this thrown to show item outofstock 
				// could have handled other way
				throw new RuntimeException("Item Out Of Stock");
				
			}
		} catch (Exception e) {
			// TODO logger implementation
			e.printStackTrace();
		}
		return orderId;
	}

	@Override
	@Transactional
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}


}
