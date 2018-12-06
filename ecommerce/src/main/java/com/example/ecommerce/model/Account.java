package com.example.ecommerce.model;

import java.util.List;

/**
 * @author gajendra
 * 
 * This model class represent user account details
 *
 */
public class Account {
	
	private String userId;
	private String accountId;
	private String userName;
	private List<String> orderIds;
	//TODO basic user's details like:- addresses,wishlist etc
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getOrderIds() {
		return orderIds;
	}
	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}
	
	

}
