package com.product.controller.customer;

import com.product.service.CustomerService;

public class CustomerUpdateById {
public static void main(String[] args) {
	CustomerService  customerService=new CustomerService();
	boolean res= customerService.updateCustomerById(3," abab"," abab@mail.com");
	System.out.println(res);
			
}
}
