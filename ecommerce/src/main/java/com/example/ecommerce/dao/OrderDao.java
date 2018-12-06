package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;

public interface OrderDao {
	public String createOrder(Order order);	
	public Order updateOrder(Order order);

}
