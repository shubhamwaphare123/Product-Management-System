package com.product.controller.product;

import com.product.dto.ProductDto;
import com.product.service.ProductService;

public class ProductSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDto productDto=new ProductDto();
		productDto.setPid(6);
		productDto.setPname("shoes");
		productDto.setPrice(200);
		ProductService productservice=new ProductService();
		ProductDto p1 =productservice.saveProduct(productDto);
		System.out.println(p1.getPid()+" product saved");

	}

}
