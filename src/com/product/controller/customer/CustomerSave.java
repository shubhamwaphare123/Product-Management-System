package com.product.controller.customer;

import com.product.dto.CustomerDto;
import com.product.service.CustomerService;

public class CustomerSave {
public static void main(String[] args) {
	CustomerDto customerDto =new CustomerDto();
	customerDto.setCid(5);
	customerDto.setCname("shub");
	customerDto.setEmail("shub@mai.com");
	
	CustomerService customerService = new CustomerService();
	CustomerDto c1=customerService.saveCustomer(customerDto);
	if(c1!=null) {
		System.out.println(c1.getCid()+" saved succesfully");
	}

	
}
	
	
}
