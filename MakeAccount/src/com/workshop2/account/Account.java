package com.workshop2.account;

public class Account {
	private String customerId;
	private String customerName;
	private String accountNumber;
	private int balance;
	
	public Account(String customerId, String customerName, String accountNumber, int balance) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	public String getCustomerId() {
		return customerId;
		
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
//	public void  setCustomerId(String customerId) {
//		this.customerId = customerId;		
//	}
//	
//	public void  setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//	
//	public void  setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	
//	public void  setBalance(int balance) {
//		this.balance = balance;
//	}
	
	public boolean deposit(int money) {
		boolean flag = false;
		System.out.printf("\n\n[�Ա�]%d���� �Ա��մϴ�.\n",money);
		if (money> 0) {
			balance += money;
			flag = true;
		}else if(money < 0) {
			System.out.println("������ �Է��ϸ� �ȵ˴ϴ�.");
		}
		return flag;
	}
	
	public boolean withdraw(int money) {
		boolean flag = false;
		System.out.printf("\n\n[���]%d���� ����մϴ�.\n",money);
		if (money> 0 && balance > money) {
			balance -= money;
			flag = true;
		}
		else if(money < 0) {
			System.out.println("������ �Է��ϸ� �ȵ˴ϴ�.");
		}
		else if(balance - money < 0) {
			System.out.println("�ܾ׺���! ����Ϸ��� �ݾ��� �ܾ׺��� Ů�ϴ�.");
		}
		return flag;
	}
	public void printAccountInfo() {
		for(int i = 0; i <20; i++) {
			System.out.print("=");
		}
		System.out.printf("\n����ȣ : %s\n",customerId);
		System.out.printf("���� : %s\n",customerName);
		System.out.printf("���¹�ȣ : %s\n",accountNumber);
		System.out.printf("�ܾ� : %d\n",balance);
		for(int i = 0; i <20; i++) {
			System.out.print("=");
		}
		
	}
	

}
