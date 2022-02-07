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
		System.out.printf("\n\n[입금]%d원을 입금합니다.\n",money);
		if (money> 0) {
			balance += money;
			flag = true;
		}else if(money < 0) {
			System.out.println("음수를 입력하면 안됩니다.");
		}
		return flag;
	}
	
	public boolean withdraw(int money) {
		boolean flag = false;
		System.out.printf("\n\n[출금]%d원을 출금합니다.\n",money);
		if (money> 0 && balance > money) {
			balance -= money;
			flag = true;
		}
		else if(money < 0) {
			System.out.println("음수를 입력하면 안됩니다.");
		}
		else if(balance - money < 0) {
			System.out.println("잔액부족! 출금하려는 금액이 잔액보다 큽니다.");
		}
		return flag;
	}
	public void printAccountInfo() {
		for(int i = 0; i <20; i++) {
			System.out.print("=");
		}
		System.out.printf("\n고객번호 : %s\n",customerId);
		System.out.printf("고객명 : %s\n",customerName);
		System.out.printf("계좌번호 : %s\n",accountNumber);
		System.out.printf("잔액 : %d\n",balance);
		for(int i = 0; i <20; i++) {
			System.out.print("=");
		}
		
	}
	

}
