package com.product.controller.product;

import com.product.service.ProductService;

public class ProductDelete {
//	StudentService studentService = new StudentService();
//	boolean res = studentService.deletestudent(1);
//	System.out.println(res);
	public static void main(String[] args) {
		ProductService productservice = new ProductService();
		boolean res = productservice.deleteProductById(1);
		System.out.println(res);
	}
	
	
}
