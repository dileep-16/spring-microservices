package com.example.ecommerce.controller;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Account;

@RestController
@RequestMapping("/user")
public class UserAccountController {
    @Produces(MediaType.APPLICATION_JSON)
	public Response createUserAccount(@RequestBody Account userAccount)
	{
		return Response.status(Status.OK).entity("All user fine").build();

}
}