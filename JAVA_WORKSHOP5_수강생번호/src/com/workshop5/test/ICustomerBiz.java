package com.workshop5.test;

import com.workshop5.entity.Customer;

public interface ICustomerBiz {
	public void initializeCustomer();
	public void printAllCustomer();
	public void insertCustomer();
	public void insertCustomer(Customer customer);
	public void deleteCustomer();
	
	

}
