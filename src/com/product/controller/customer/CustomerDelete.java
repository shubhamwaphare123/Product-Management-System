package com.product.controller.customer;

import com.product.service.CustomerService;
//import com.school.service.StudentService;

public class CustomerDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		CustomerService customerservice = new CustomerService();
		boolean res = customerservice.deleteCustomerById(2);
		System.out.println(res);

	}

}
