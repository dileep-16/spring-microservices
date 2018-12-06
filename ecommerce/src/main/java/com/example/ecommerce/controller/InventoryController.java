package com.example.ecommerce.controller;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Inventory;
import com.example.ecommerce.service.InventoryService;

@RestController
@RequestMapping
public class InventoryController {
@Autowired
InventoryService inventoryservice;

@RequestMapping("/status")
 public Response getInventoryStatus()
 {
	List<Inventory> inventory=inventoryservice.getInventoryUpdates();
	 return Response.status(Status.OK).entity(inventory).build();
	 
 }
@RequestMapping("add/product") 
public Response updateInventoryStatus(@RequestBody Inventory product)
{
	String ProductId=inventoryservice.addProduct(product);
	return Response.status(Status.OK).entity(ProductId).build();
	
}
}
