package com.product.controller.customer;

import com.product.dto.CustomerDto;
import com.product.service.CustomerService;

public class CustomerGetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		CustomerDto customerDto=new CustomerDto();
		customerDto.setCid(1);
		CustomerService customerservice = new CustomerService();
		CustomerDto c=customerservice.selectCustomerById(customerDto);
		if(c!=null) {
			System.out.println(c);
		}
		
	}

}
