package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.CustomerHelperClass;
import com.product.dto.CustomerDto;
import com.product.dto.ProductDto;

public class CustomerDao {
	CustomerHelperClass helperClass=new CustomerHelperClass();
	Connection connection = null;
	//get all=======================
	
	public CustomerDto getallCustomer(CustomerDto customer) {
		connection = helperClass.getconnection();
		String sql="SELECT * FROM customer";
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
		return customer;

	
	}
	
	//delet=====
	public boolean deleteCustomerById(int id) {
		connection = helperClass.getconnection();
		String sql = "DELETE  FROM customer WHERE ID=?";
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
	
	//save data========================================================
	public CustomerDto saveCustomer(CustomerDto customer) {
		connection = helperClass.getconnection();
		String sql = "INSERT INTO customer VALUES(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getCid());
			preparedStatement.setString(2, customer.getCname());
			preparedStatement.setString(3, customer.getEmail());

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
		return customer;

	}

}
