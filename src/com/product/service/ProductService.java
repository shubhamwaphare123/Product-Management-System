package com.product.service;

import com.product.dao.ProductDao;
import com.product.dto.ProductDto;

public class ProductService {
	ProductDao productDao =new ProductDao();
	public ProductDto saveProduct(ProductDto product) {
		return productDao.saveProduct(product);
	}
	
	public boolean deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}
	public ProductDto getallProduct(ProductDto product) {
		return productDao.getallProduct(product);
	}

	

}
