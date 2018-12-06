package com.example.ecommerce.service;

import com.example.ecommerce.model.Order;

public interface OrderService {
	public String createOrder(Order order);
	public Order updateOrder(Order order);
}
