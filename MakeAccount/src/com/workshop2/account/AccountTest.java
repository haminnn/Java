package com.workshop2.account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("CUST01","ȫ�浿","11-222-3333",100000);
		Scanner input = new Scanner(System.in);
		System.out.println("1.�Ա�, 2.���");
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
			int ds = input.nextInt();
			a.deposit(ds);
			a.printAccountInfo();
			break;
		case 2:
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			int wd = input.nextInt();
			a.withdraw(wd);
			a.printAccountInfo();
			break;
		default:
			System.out.println("�߸��Է��߽��ϴ�.");
			break;
		}


	}

}
