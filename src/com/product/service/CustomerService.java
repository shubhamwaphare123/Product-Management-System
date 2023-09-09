package com.product.service;

import com.product.dao.CustomerDao;
import com.product.dto.CustomerDto;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	public CustomerDto saveCustomer(CustomerDto customer) {
		return customerDao.saveCustomer(customer);
	}
	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);
	}
	public CustomerDto getallCustomer(CustomerDto customer) {
		return customerDao.getallCustomer(customer);
	}



}
