package com.product.controller.product;

import com.product.dao.ProductDao;
import com.product.dto.ProductDto;
import com.product.service.ProductService;
//import com.school.dto.Student;
//import com.school.service.StudentService;

public class ProductGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentService studentservice=new StudentService();
//		Student student=null;
//		Student s=studentservice.getAllstudent(student);
//		if(s!=null) {
//			System.out.println(s);
		ProductService productservice = new ProductService();
		ProductDto productDto = null;
		ProductDto p=productservice.getallProduct(productDto);
		if(p!=null) {
			System.out.println(p);
		}
	

	}

}
