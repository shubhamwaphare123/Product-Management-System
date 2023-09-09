package com.product.controller.customer;

import com.product.dto.CustomerDto;
import com.product.dto.ProductDto;
import com.product.service.CustomerService;
import com.product.service.ProductService;

public class CustomerGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentService studentservice=new StudentService();
//		Student student=null;
//		Student s=studentservice.getAllstudent(student);
//		if(s!=null) {
//			System.out.println(s);
//		ProductService productservice = new ProductService();
//		ProductDto productDto = null;
//		ProductDto p=productservice.getallProduct(productDto);
//		
		CustomerService customerService=new CustomerService();
		CustomerDto customerDto=null;
		CustomerDto c =customerService.getallCustomer(customerDto);
		if(c!=null) {
			System.out.println(c);
		}
	

	}
}
