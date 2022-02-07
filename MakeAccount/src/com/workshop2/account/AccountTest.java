package com.workshop2.account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account("CUST01","홍길동","11-222-3333",100000);
		Scanner input = new Scanner(System.in);
		System.out.println("1.입금, 2.출금");
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("얼마를 입금하시겠습니까?");
			int ds = input.nextInt();
			a.deposit(ds);
			a.printAccountInfo();
			break;
		case 2:
			System.out.println("얼마를 출력하시겠습니까?");
			int wd = input.nextInt();
			a.withdraw(wd);
			a.printAccountInfo();
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}


	}

}
