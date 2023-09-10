package com.product.controller.product;

import com.product.dto.CustomerDto;
import com.product.dto.ProductDto;
import com.product.service.CustomerService;
import com.product.service.ProductService;

public class ProductGetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CustomerDto customerDto=new CustomerDto();
//		customerDto.setCid(1);
//		CustomerService customerservice = new CustomerService();
//		CustomerDto c=customerservice.selectCustomerById(customerDto);
//		if(c!=null) {
//			System.out.println(c);
//		}
//		
		
		ProductDto productDto=new ProductDto();
		productDto.setPid(3);
		ProductService productservice = new ProductService();
		ProductDto p=productservice.selectCustomerById(productDto);
		if(p!=null) {
			System.out.println(p);
		}

	}

}
