package com.product.controller.product;

import com.product.service.ProductService;

public class ProductUpdateById {
	
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean u=productService.updateProductById(4,"bat",30.0);
		System.out.println(u);
		
	}

}
