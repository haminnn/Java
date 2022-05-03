package com.workshop5.test;

import java.util.ArrayList;
import java.util.List;

import com.workshop5.entity.Customer;

public class CustomerBiz implements ICustomerBiz{
	List<Customer> customers = new ArrayList<Customer>();
	
			
	public void initializeCustomer() {
		customers.add( new Customer("lee", 28, "010-5678-1234"));
		customers.add( new Customer("Park", 31, "010-4567-9876"));
		customers.add( new Customer("Choi", 25, "010-1111-2222"));
		customers.add( new Customer("Hong", 27, "010-4679-8522"));
	}
	
	public void printAllCustomer() {
		System.out.println("--------------°í°´Á¤º¸--------------");
//		for(int i = 0; i <customers.size(); i++) {
//			System.out.println(customers.get(i).getName()
//					+customers.get(i).getAge() + customers.get(i).getPhone());
//		}
		for(Customer c : customers) {
			System.out.println(c.getName()+c.getAge()+c.getPhone());
		}
	}
	
	public void insertCustomer() {
		
		
	}
	
	public void insertCustomer(Customer customer) {
		
	}
	
	public void deleteCustomer() {
		
	}
	

}
