package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.CustomerHelperClass;
import com.product.dto.CustomerDto;
import com.product.dto.ProductDto;

public class ProductDao {
	CustomerHelperClass helperClass=new CustomerHelperClass();
	Connection connection = null;
	//update by id=================================
	//update by id ================================
		public boolean updateProductById(int id,String name,double d) {
			connection = helperClass.getconnection();
			String sql = "UPDATE product SET name=? , price=? WHERE id =?";
			int i =0;
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, name);
				preparedStatement.setDouble(2, d);
				preparedStatement.setInt(3, id);
				i = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (i > 0) {
				return true;
			} else {
				return false;
			}

		}
	
	//get by id============================================
	///get by id
	public ProductDto selectCustomerById(ProductDto product) {
		connection = helperClass.getconnection();
		String sql = "SELECT *  FROM product WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getPid());
            ResultSet resultSet =preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("============================");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
		
	}
	
	//get all=====================================
	public ProductDto getallProduct(ProductDto product) {
		connection = helperClass.getconnection();
		String sql="SELECT * FROM product";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet =preparedStatement.executeQuery(sql);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;

	
	}
	
	/// delete========================================
	public boolean deleteProductById(int id) {
		connection = helperClass.getconnection();
		String sql = "DELETE  FROM product WHERE ID=?";
		int i =0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	//save product=====================================================
	public ProductDto saveProduct(ProductDto product) {
		connection = helperClass.getconnection();
		String sql = "INSERT INTO product VALUES(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getPid());
			preparedStatement.setString(2, product.getPname());
			preparedStatement.setFloat(3, product.getPrice());

			preparedStatement.execute();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return product;

	}
	
}
