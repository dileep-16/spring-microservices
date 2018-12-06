package com.example.ecommerce.model;

import java.util.Date;

/**
 * @author gajendra
 * 
 * This model class represents order details
 *
 */
public class Order {
	
	private String orderId;
	private String accountId;
	private String productId;
	private int orderAmount;
	private int quantity;
	private Date createdDate;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", accountId=" + accountId + ", productId=" + productId + ", orderAmount="
				+ orderAmount + ", quantity=" + quantity + ", createdDate=" + createdDate + "]";
	}

}
