package com.example.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Order;
@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired MongoTemplate mongoTemplate;

	@Override
	public String createOrder(Order order) {
		
		try {
			mongoTemplate.save(order);
		} catch (Exception e) {
			// TODO logging of database error
			e.printStackTrace();
			throw e;
		}
		return order.getOrderId();
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}


}
